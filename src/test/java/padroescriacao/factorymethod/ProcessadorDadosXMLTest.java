package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

 
class ProcessadorDadosXMLTest {

    private IProcessadorDados processador;

    @BeforeEach
    void setUp() {
        processador = ProcessadorDadosFactory.obterProcessador("XML");
    }

    @Test
    @DisplayName("Deve processar dados XML")
    void deveProcessarDadosXML() {
        String resultado = processador.processar();
        assertEquals("XML processado com sucesso", resultado);
    }

    @Test
    @DisplayName("Deve validar dados XML")
    void deveValidarDadosXML() {
        String resultado = processador.validar();
        assertEquals("XML validado com sucesso", resultado);
    }

    @Test
    @DisplayName("Deve executar operações sob stress")
    void deveExecutarOperacoesSobStress() {
        // Teste de valor limite - stress test
        long inicioTempo = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            processador.processar();
            processador.validar();
        }
        long fimTempo = System.currentTimeMillis();
        long duracao = fimTempo - inicioTempo;
        
        assertTrue(duracao < 1000, "Operações devem executar em menos de 1 segundo");
    }

    @Test
    @DisplayName("Deve implementar interface corretamente")
    void deveImplementarInterfaceCorretamente() {
        // Caso base - verificar implementação da interface
        assertTrue(processador instanceof IProcessadorDados);
        assertTrue(processador instanceof ProcessadorDadosXML);
    }
}
