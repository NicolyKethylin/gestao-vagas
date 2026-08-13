package com.np.gestao_vagas.candidate;

import java.util.UUID;

// Realiza validação
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotBlank;
// Importar gets e sets
import lombok.Data;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;
//
//    @Pattern(regexp = "^(?!\\s*$).+")
//    @NotBlank(message = "O username não pode ser vazio")
    @NotBlank(message = "O username não pode ser vazio")
    @Pattern(
            regexp = "^[a-zA-Z0-9_]+$",
            message = "O username deve conter apenas letras, números e _"
    )
    private String username;

    @Email(message = "O campo deve conter um e-mail válido")
    @NotBlank(message = "O e-mail não pode ser vazio")
    private String email;


    private String password;
    private String description;
    private String curriculum;


}
