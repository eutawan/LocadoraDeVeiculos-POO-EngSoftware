package service;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Autenticacao {
    private String login;
    private String senha;

    public Boolean autenticar(String login, String senha){
        return this.login.equals(login) && this.senha.equals(senha);
    }
}
