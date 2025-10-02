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
    void deveCriarTodosOsNotificadores() {
        assertNotNull(NotificadorFactory.obterNotificador("Email"));
        assertNotNull(NotificadorFactory.obterNotificador("SMS"));
        assertNotNull(NotificadorFactory.obterNotificador("Push"));
        assertNotNull(NotificadorFactory.obterNotificador("WhatsApp"));
        assertNotNull(NotificadorFactory.obterNotificador("Telegram"));
    }
}
