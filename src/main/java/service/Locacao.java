package service;
import domain.Locatario;
import domain.Veiculo;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@NoArgsConstructor
public class Locacao {

    private Locatario locatario;
    private Veiculo veiculo;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private Double valorDiaria;

    public double locar(Locatario locatario, Veiculo veiculo, LocalDate dataLocacao,
                               LocalDate dataDevolucao, Double valorDiaria){

        long diasDeLocacao = ChronoUnit.DAYS.between(dataLocacao, dataDevolucao);

        return valorDiaria * diasDeLocacao;
    }
}
