package com.academia.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia.academia.entity.Aluno;
import com.academia.academia.entity.AvaliacaoFisica;
import com.academia.academia.entity.form.AlunoForm;
import com.academia.academia.repository.AlunoRepository;
import com.academia.academia.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;
    
    @Override
    public Aluno create(AlunoForm form){

        Aluno aluno = new Aluno();

        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {

        return null;
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        
        if(dataDeNascimento == null){
           return repository.findAll();
        }else{
            //LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataDeNascimento(dataDeNascimento);
        }

    }

    @Override
    public void delete(Long id) {
        
        repository.deleteById(id);
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        
        Aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();

    }


    
}
