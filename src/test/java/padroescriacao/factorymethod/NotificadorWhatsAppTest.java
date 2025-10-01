package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificadorWhatsAppTest {

    @Test
    void deveEnviarWhatsApp() {
        INotificador notificador = NotificadorFactory.obterNotificador("WhatsApp");
        assertEquals("Mensagem WhatsApp enviada para +5511988887777 com sucesso", 
                     notificador.enviar("+5511988887777", "Mensagem de teste"));
    }

    @Test
    void deveValidarDestinatarioWhatsApp() {
        INotificador notificador = NotificadorFactory.obterNotificador("WhatsApp");
        assertEquals("Número de telefone válido", notificador.validarDestinatario("+5511988887777"));
    }
}
