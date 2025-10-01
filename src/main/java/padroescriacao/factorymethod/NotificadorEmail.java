package padroescriacao.factorymethod;

public class NotificadorEmail implements INotificador {
    
    @Override
    public String enviar(String destinatario, String mensagem) {
        return "Email enviado para " + destinatario + " com sucesso";
    }

    @Override
    public String validarDestinatario(String destinatario) {
        return "Email válido";
    }
}
