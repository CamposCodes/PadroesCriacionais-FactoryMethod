package padroescriacao.factorymethod;

public class NotificadorFactory {

    // Retorna um notificador baseado no tipo (Email, SMS, Push, WhatsApp)
    public static INotificador obterNotificador(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            // Usa reflexão para criar a classe dinamicamente
            classe = Class.forName("padroescriacao.factorymethod.Notificador" + tipo);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Notificador inexistente");
        }
        if (!(objeto instanceof INotificador)) {
            throw new IllegalArgumentException("Notificador inválido");
        }
        return (INotificador) objeto;
    }
}
