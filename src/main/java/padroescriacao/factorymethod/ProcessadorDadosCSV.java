package padroescriacao.factorymethod;

public class ProcessadorDadosCSV implements IProcessadorDados {

    public String processar() {
        return "CSV processado com sucesso";
    }

    public String validar() {
        return "CSV validado com sucesso";
    }
}
