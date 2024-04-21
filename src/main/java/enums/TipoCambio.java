package enums;

public enum TipoCambio {
    MANUAL("Manual"),
    AUTOMATICO("Automatico");

    private String tipoCambio;

    TipoCambio(String tipoCambio){
        this.tipoCambio = tipoCambio;
    }
}
