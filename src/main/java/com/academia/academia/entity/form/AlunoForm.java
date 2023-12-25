package com.academia.academia.entity.form;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
    
    @NotEmpty(message = "Preencha o campo nome corretamente.")
    @Size(min = 3, max = 50, message = "'${validatedValue}' o campo nome precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "Preecha o campo cpf corretamente.")
    private String cpf;

    @NotEmpty(message = "Preencha o campo bairro corretamente.")
    @Size(min = 3, max = 50, message = "'${validatedValue}' o campo bairro precisa estar entre {min} e {max} caracteres.")
    private String bairro;
    
    @NotNull(message = "Preencha o campo data de nascimento corretamente.")
    //@Past(message = "Data '${validatedValues}' é uma data futura porém invalidade.")
    private String dataDeNascimento;

}
