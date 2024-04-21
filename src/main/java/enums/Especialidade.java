package enums;

public enum Especialidade {

    PEQUENO_PORTE("Veículos de pequeno porte"),
    GRANDE_PORTE("Veículos de grande porte");

    private String tipoEspecialidade;

    Especialidade(String tipoEspecialidade){
        this.tipoEspecialidade = tipoEspecialidade;
    }
}
