package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class ProcessadorDadosJSONTest {

    private IProcessadorDados processador;

    @BeforeEach
    void setUp() {
        processador = ProcessadorDadosFactory.obterProcessador("JSON");
    }

    @Test
    @DisplayName("Deve processar dados JSON")
    void deveProcessarDadosJSON() {
        String resultado = processador.processar();
        assertEquals("JSON processado com sucesso", resultado);
    }

    @Test
    @DisplayName("Deve validar dados JSON")
    void deveValidarDadosJSON() {
        String resultado = processador.validar();
        assertEquals("JSON validado com sucesso", resultado);
    }

    @Test
    @DisplayName("Deve executar operações múltiplas vezes")
    void deveExecutarOperacoesMultiplasVezes() {
        // Teste de valor limite - múltiplas execuções
        for (int i = 0; i < 100; i++) {
            assertEquals("JSON processado com sucesso", processador.processar());
            assertEquals("JSON validado com sucesso", processador.validar());
        }
    }

    @Test
    @DisplayName("Deve manter estado consistente")
    void deveManterEstadoConsistente() {
        // Caso base - verificar consistência do estado
        String processamento1 = processador.processar();
        String validacao1 = processador.validar();
        String processamento2 = processador.processar();
        String validacao2 = processador.validar();
        
        assertEquals(processamento1, processamento2);
        assertEquals(validacao1, validacao2);
    }
}
