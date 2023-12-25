package com.academia.academia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academia.academia.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

List<Aluno> findByDataDeNascimento(String dataDeNascimento);    

}
