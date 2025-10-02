package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificadorTelegramTest {

    @Test
    void deveEnviarTelegram() {
        INotificador notificador = NotificadorFactory.obterNotificador("Telegram");
        assertEquals("Telegram enviado para @usuario_teste com sucesso",
                notificador.enviar("@usuario_teste", "Mensagem de teste"));
    }

    @Test
    void deveValidarDestinatarioTelegram() {
        INotificador notificador = NotificadorFactory.obterNotificador("Telegram");
        assertEquals("Usu�rio do Telegram v�lido", notificador.validarDestinatario("@usuario_teste"));
    }
}
