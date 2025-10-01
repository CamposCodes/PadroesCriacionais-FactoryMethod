package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificadorFactoryTest {

    @Test
    void deveRetornarExcecaoParaNotificadorInexistente() {
        try {
            INotificador notificador = NotificadorFactory.obterNotificador("Inexistente");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Notificador inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaNotificadorInvalido() {
        try {
            INotificador notificador = NotificadorFactory.obterNotificador("Telegram");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Notificador inválido", e.getMessage());
        }
    }
}
