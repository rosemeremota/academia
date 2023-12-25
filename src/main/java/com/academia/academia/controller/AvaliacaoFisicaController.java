package com.academia.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.academia.entity.AvaliacaoFisica;
import com.academia.academia.entity.form.AvaliacaoFisicaForm;
import com.academia.academia.service.impl.AvalicaoServiceImpl;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
    
    @Autowired
    private AvalicaoServiceImpl serviceImpl;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form ){
     return serviceImpl.create(form);
    }
    
    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return serviceImpl.getAll();
    }
}
