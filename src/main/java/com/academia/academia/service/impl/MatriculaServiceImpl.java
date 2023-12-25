package com.academia.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia.academia.entity.Aluno;
import com.academia.academia.entity.Matricula;
import com.academia.academia.entity.form.MatriculaForm;
import com.academia.academia.repository.AlunoRepository;
import com.academia.academia.repository.MatriculaRepository;
import com.academia.academia.service.IMatriculaService;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
    
    @Autowired
    private MatriculaRepository matriculaRepository;
    @Autowired 
    private AlunoRepository alunoRepository;
    
    
    @Override
    public Matricula create(MatriculaForm form) {
        
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        matricula.setAluno(aluno);
        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        
        return matriculaRepository.findById(id).get();

    }

    @Override
    public List<Matricula> getAll(String bairro) {
       
        if(bairro == null){
           return matriculaRepository.findAll();
        }else{
           return matriculaRepository.findByAlunoBairro(bairro);
        }
    }
    @Override
    public void delete(Long id) {
        
        matriculaRepository.deleteById(id);
    }
    
    
}
