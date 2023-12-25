package com.academia.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.academia.academia.entity.Matricula;
import com.academia.academia.entity.form.MatriculaForm;
import com.academia.academia.service.impl.MatriculaServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    
    @Autowired
    private MatriculaServiceImpl serviceImpl;

 @PostMapping
 public Matricula create(@Valid @RequestBody MatriculaForm form){
    return serviceImpl.create(form);
 }

 @GetMapping
 public List<Matricula> getAll(@RequestParam(value="bairro", required = false) String bairro){
    return serviceImpl.getAll(bairro);
 }

}
