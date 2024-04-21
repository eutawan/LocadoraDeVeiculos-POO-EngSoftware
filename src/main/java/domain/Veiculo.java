package domain;
import enums.Cor;
import lombok.Data;


@Data
public abstract class Veiculo {

    private String marca;
    private String modelo;
    private Cor cor;
    private Integer ano;
    private String placa;


}
