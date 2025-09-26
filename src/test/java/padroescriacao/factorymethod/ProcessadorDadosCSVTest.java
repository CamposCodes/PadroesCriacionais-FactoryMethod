package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class ProcessadorDadosCSVTest {

    private IProcessadorDados processador;

    @BeforeEach
    void setUp() {
        processador = ProcessadorDadosFactory.obterProcessador("CSV");
    }

    @Test
    @DisplayName("Deve processar dados CSV")
    void deveProcessarDadosCSV() {
        String resultado = processador.processar();
        assertEquals("CSV processado com sucesso", resultado);
    }

    @Test
    @DisplayName("Deve validar dados CSV")
    void deveValidarDadosCSV() {
        String resultado = processador.validar();
        assertEquals("CSV validado com sucesso", resultado);
    }

    @Test
    @DisplayName("Deve lidar com caso limite mínimo")
    void deveLidarComCasoLimiteMinimo() {
        // Teste de valor limite - caso mínimo
        assertNotNull(processador.processar());
        assertNotNull(processador.validar());
        assertTrue(processador.processar().length() > 0);
        assertTrue(processador.validar().length() > 0);
    }

    @Test
    @DisplayName("Deve ser thread-safe")
    void deveSerThreadSafe() throws InterruptedException {
        // Teste de concorrência - múltiplas threads
        Thread[] threads = new Thread[10];
        boolean[] resultados = new boolean[10];
        
        for (int i = 0; i < 10; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                try {
                    String proc = processador.processar();
                    String val = processador.validar();
                    resultados[index] = "CSV processado com sucesso".equals(proc) && 
                                       "CSV validado com sucesso".equals(val);
                } catch (Exception e) {
                    resultados[index] = false;
                }
            });
            threads[i].start();
        }
        
        for (Thread thread : threads) {
            thread.join();
        }
        
        for (boolean resultado : resultados) {
            assertTrue(resultado, "Todas as threads devem executar com sucesso");
        }
    }
}
