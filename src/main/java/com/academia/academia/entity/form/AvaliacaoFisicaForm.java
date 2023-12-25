package com.academia.academia.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {
    
    @Positive(message = "O Id do Aluno precisa ter um valor positivo.")
    private Long alunoId;

    @NotNull(message = "Preencha o campo peso corretamente.")
    @Positive(message = "O peso do Aluno precisa ter um valor positivo.")
    private double peso;

    @NotNull(message = "Preencha o campo altura corretamente.")
    @Positive(message = "A altura do Aluno precisa ter um valor positivo.")
    private double altura;

}
