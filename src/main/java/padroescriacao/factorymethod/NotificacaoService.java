package padroescriacao.factorymethod;

// Serviço que utiliza a Factory para gerenciar o envio de notificações
public class NotificacaoService {
    public String enviarNotificacao(String tipoNotificador, String destinatario, String mensagem) {
        INotificador notificador = NotificadorFactory.obterNotificador(tipoNotificador);
        return notificador.enviar(destinatario, mensagem);
    }
}
