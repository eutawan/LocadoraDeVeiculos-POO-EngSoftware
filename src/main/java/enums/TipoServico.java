package enums;

public enum TipoServico {
    TROCA_OLEO("Trocar o óleo"),
    REPARO_ARCONDICIONADO("Reparo  de ar condicionado"),
    ALINHAMENTO("Alinhamento");

    private String tipoServico;

    TipoServico(String tipoServico){
        this.tipoServico = tipoServico;
    }
}
