package padroescriacao.factorymethod;

public class NotificadorWhatsApp implements INotificador {
    
    @Override
    public String enviar(String destinatario, String mensagem) {
        return "Mensagem WhatsApp enviada para " + destinatario + " com sucesso";
    }

    @Override
    public String validarDestinatario(String destinatario) {
        return "Número de telefone válido";
    }
}
