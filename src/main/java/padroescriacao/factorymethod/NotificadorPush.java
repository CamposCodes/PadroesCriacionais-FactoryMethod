package padroescriacao.factorymethod;

public class NotificadorPush implements INotificador {
    
    @Override
    public String enviar(String destinatario, String mensagem) {
        return "Push notification enviada para dispositivo " + destinatario + " com sucesso";
    }

    @Override
    public String validarDestinatario(String destinatario) {
        return "Token do dispositivo válido";
    }
}
