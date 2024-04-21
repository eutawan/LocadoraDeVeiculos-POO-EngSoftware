package enums;

public enum Setor {
    OPERACIONAL("Setor operacional"),
    FINANCEIRO("Setor financeiro");

    private String tipoSetor;

    Setor(String tipoSetor){
        this.tipoSetor = tipoSetor;
    }
}
