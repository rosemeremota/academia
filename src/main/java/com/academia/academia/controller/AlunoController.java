package com.academia.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.academia.academia.entity.Aluno;
import com.academia.academia.entity.AvaliacaoFisica;
import com.academia.academia.entity.form.AlunoForm;
import com.academia.academia.service.impl.AlunoServiceImpl;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl serviceImpl;

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form){

        return serviceImpl.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
           return serviceImpl.getAllAvaliacaoFisicaId(id); 
    }

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                                String dataDeNacimento){
        return serviceImpl.getAll(dataDeNacimento);
    }    
    
}
