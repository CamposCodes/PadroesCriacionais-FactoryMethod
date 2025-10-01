package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacaoServiceTest {

    @Test
    void deveEnviarNotificacaoPorEmail() {
        NotificacaoService service = new NotificacaoService();
        String resultado = service.enviarNotificacao("Email", "teste@exemplo.com", "Mensagem de teste");
        assertEquals("Email enviado para teste@exemplo.com com sucesso", resultado);
    }

    @Test
    void deveEnviarNotificacaoPorSMS() {
        NotificacaoService service = new NotificacaoService();
        String resultado = service.enviarNotificacao("SMS", "11988887777", "Mensagem de teste");
        assertEquals("SMS enviado para 11988887777 com sucesso", resultado);
    }

    @Test
    void deveEnviarNotificacaoPorPush() {
        NotificacaoService service = new NotificacaoService();
        String token = "abc123def456ghi789jkl012mno345pqr678stu901vwx234yz567890abcdef";
        String resultado = service.enviarNotificacao("Push", token, "Mensagem de teste");
        assertEquals("Push notification enviada para dispositivo " + token + " com sucesso", resultado);
    }

    @Test
    void deveEnviarNotificacaoPorWhatsApp() {
        NotificacaoService service = new NotificacaoService();
        String resultado = service.enviarNotificacao("WhatsApp", "+5511988887777", "Mensagem de teste");
        assertEquals("Mensagem WhatsApp enviada para +5511988887777 com sucesso", resultado);
    }
}
