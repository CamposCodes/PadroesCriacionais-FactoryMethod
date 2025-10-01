package padroescriacao.factorymethod;

public class NotificadorSMS implements INotificador {
    
    @Override
    public String enviar(String destinatario, String mensagem) {
        return "SMS enviado para " + destinatario + " com sucesso";
    }

    @Override
    public String validarDestinatario(String destinatario) {
        return "Número de telefone válido";
    }
}
