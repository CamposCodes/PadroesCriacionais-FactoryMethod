package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificadorSMSTest {

    @Test
    void deveEnviarSMS() {
        INotificador notificador = NotificadorFactory.obterNotificador("SMS");
        assertEquals("SMS enviado para 11988887777 com sucesso", 
                     notificador.enviar("11988887777", "Mensagem de teste"));
    }

    @Test
    void deveValidarDestinatarioSMS() {
        INotificador notificador = NotificadorFactory.obterNotificador("SMS");
        assertEquals("Número de telefone válido", notificador.validarDestinatario("11988887777"));
    }
}
