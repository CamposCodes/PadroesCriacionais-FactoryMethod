package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class ProcessadorDadosFactoryTest {

    @Test
    @DisplayName("Deve retornar exceção para processador inexistente")
    void deveRetornarExcecaoParaProcessadorInexistente() {
        try {
            IProcessadorDados processador = ProcessadorDadosFactory.obterProcessador("PDF");
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Processador inexistente", e.getMessage());
        }
    }

    @Test
    @DisplayName("Deve retornar exceção para processador inválido")
    void deveRetornarExcecaoParaProcessadorInvalido() {
        try {
            IProcessadorDados processador = ProcessadorDadosFactory.obterProcessador("TXT");
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Processador inválido", e.getMessage());
        }
    }

    @Test
    @DisplayName("Deve retornar exceção para entrada nula")
    void deveRetornarExcecaoParaEntradaNula() {
        try {
            IProcessadorDados processador = ProcessadorDadosFactory.obterProcessador(null);
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Processador inexistente", e.getMessage());
        }
    }

    @Test
    @DisplayName("Deve retornar exceção para entrada vazia")
    void deveRetornarExcecaoParaEntradaVazia() {
        try {
            IProcessadorDados processador = ProcessadorDadosFactory.obterProcessador("");
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Processador inexistente", e.getMessage());
        }
    }

    @Test
    @DisplayName("Deve criar processador JSON válido")
    void deveCriarProcessadorJSONValido() {
        IProcessadorDados processador = ProcessadorDadosFactory.obterProcessador("JSON");
        assertNotNull(processador);
        assertTrue(processador instanceof ProcessadorDadosJSON);
    }

    @Test
    @DisplayName("Deve criar processador XML válido")
    void deveCriarProcessadorXMLValido() {
        IProcessadorDados processador = ProcessadorDadosFactory.obterProcessador("XML");
        assertNotNull(processador);
        assertTrue(processador instanceof ProcessadorDadosXML);
    }

    @Test
    @DisplayName("Deve criar processador CSV válido")
    void deveCriarProcessadorCSVValido() {
        IProcessadorDados processador = ProcessadorDadosFactory.obterProcessador("CSV");
        assertNotNull(processador);
        assertTrue(processador instanceof ProcessadorDadosCSV);
    }
}
