package padroescriacao.factorymethod;

public class ProcessadorDadosJSON implements IProcessadorDados {

    public String processar() {
        return "JSON processado com sucesso";
    }

    public String validar() {
        return "JSON validado com sucesso";
    }
}
