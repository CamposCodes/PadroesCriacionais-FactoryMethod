package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificadorPushTest {

    @Test
    void deveEnviarPush() {
        INotificador notificador = NotificadorFactory.obterNotificador("Push");
        String token = "abc123def456ghi789jkl012mno345pqr678stu901vwx234yz567890abcdef";
        assertEquals("Push notification enviada para dispositivo " + token + " com sucesso", 
                     notificador.enviar(token, "Mensagem de teste"));
    }

    @Test
    void deveValidarDestinatarioPush() {
        INotificador notificador = NotificadorFactory.obterNotificador("Push");
        String token = "abc123def456ghi789jkl012mno345pqr678stu901vwx234yz567890abcdef";
        assertEquals("Token do dispositivo válido", notificador.validarDestinatario(token));
    }
}
