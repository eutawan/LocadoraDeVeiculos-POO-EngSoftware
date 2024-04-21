package domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class Locatario extends Pessoa {
    private String email;
}
