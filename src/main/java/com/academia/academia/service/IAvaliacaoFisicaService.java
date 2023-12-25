package com.academia.academia.service;

import java.util.List;

import com.academia.academia.entity.AvaliacaoFisica;
import com.academia.academia.entity.form.AvaliacaoFisicaForm;

public interface IAvaliacaoFisicaService {
    
  AvaliacaoFisica create(AvaliacaoFisicaForm form);
  
  AvaliacaoFisica get(Long id);
  
  List<AvaliacaoFisica> getAll();
 
  void delete(Long id);
}
