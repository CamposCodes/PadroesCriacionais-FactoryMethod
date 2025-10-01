package padroescriacao.factorymethod;

public interface INotificador {
    
    String enviar(String destinatario, String mensagem);
    
    String validarDestinatario(String destinatario);
}
