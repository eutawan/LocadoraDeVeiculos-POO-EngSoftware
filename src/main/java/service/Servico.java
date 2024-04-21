package service;

import enums.TipoServico;
import lombok.Data;

import java.util.List;
@Data

public class Servico {
    private double valorServico;
    private List<TipoServico> tipoServicoList;
}
