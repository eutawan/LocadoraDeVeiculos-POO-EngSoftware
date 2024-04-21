package domain;

import lombok.Data;
import service.Autenticacao;
@Data
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Autenticacao autenticacao;

}
