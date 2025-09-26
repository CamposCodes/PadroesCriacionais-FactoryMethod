package padroescriacao.factorymethod;

public class ProcessadorDadosXML implements IProcessadorDados {

    public String processar() {
        return "XML processado com sucesso";
    }

    public String validar() {
        return "XML validado com sucesso";
    }
}
