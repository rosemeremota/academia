package com.academia.academia.service;

import java.util.List;

import com.academia.academia.entity.Aluno;
import com.academia.academia.entity.AvaliacaoFisica;
import com.academia.academia.entity.form.AlunoForm;

public interface IAlunoService {

Aluno create(AlunoForm form);

Aluno get(Long id);

List<Aluno> getAll(String dataDeNascimento);

void delete(Long id);

List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);


}
