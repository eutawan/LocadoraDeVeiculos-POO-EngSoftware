package service;

import domain.Mecanico;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Revisao {
    private Locacao locacao;
    private Servico servico;
    private Mecanico mecanicoResponsavel;
}
