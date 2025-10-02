package padroescriacao.factorymethod;

public class NotificadorTelegram implements INotificador {

    @Override
    public String enviar(String destinatario, String mensagem) {
        return "Telegram enviado para " + destinatario + " com sucesso";
    }

    @Override
    public String validarDestinatario(String destinatario) {
        return "Usuário do Telegram válido";
    }
}
