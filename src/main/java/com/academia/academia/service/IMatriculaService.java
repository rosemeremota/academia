package com.academia.academia.service;

import java.util.List;

import com.academia.academia.entity.Matricula;
import com.academia.academia.entity.form.MatriculaForm;

public interface IMatriculaService {
    
    Matricula create(MatriculaForm form);
    Matricula get(Long id);
    List<Matricula> getAll(String bairro);
    void delete(Long id);

}
