package com.academia.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia.academia.entity.Aluno;
import com.academia.academia.entity.AvaliacaoFisica;
import com.academia.academia.entity.form.AvaliacaoFisicaForm;
import com.academia.academia.repository.AlunoRepository;
import com.academia.academia.repository.AvaliacaoFisicaRepository;
import com.academia.academia.service.IAvaliacaoFisicaService;

@Service
public class AvalicaoServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoRepository;
    
    @Autowired
    private AlunoRepository alunoRepository;
    
    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form){

        AvaliacaoFisica avaliacao = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacao.setAltura(form.getAltura());
        avaliacao.setPeso(form.getPeso());
        avaliacao.setAluno(aluno);

        return avaliacaoRepository.save(avaliacao);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return avaliacaoRepository.findById(id).get();
    }

    @Override
    public List<AvaliacaoFisica> getAll() {

        return avaliacaoRepository.findAll();
    }

    @Override
    public void delete(Long id) {

        avaliacaoRepository.deleteById(id);
    }
    
    
}
