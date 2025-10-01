package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificadorEmailTest {

    @Test
    void deveEnviarEmail() {
        INotificador notificador = NotificadorFactory.obterNotificador("Email");
        assertEquals("Email enviado para teste@exemplo.com com sucesso", 
                     notificador.enviar("teste@exemplo.com", "Mensagem de teste"));
    }

    @Test
    void deveValidarDestinatarioEmail() {
        INotificador notificador = NotificadorFactory.obterNotificador("Email");
        assertEquals("Email válido", notificador.validarDestinatario("teste@exemplo.com"));
    }
}
