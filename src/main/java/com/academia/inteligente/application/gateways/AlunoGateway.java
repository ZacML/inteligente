package com.academia.inteligente.application.gateways;

import java.util.List;

import com.academia.inteligente.domain.Aluno;

public interface AlunoGateway {

    Aluno createAluno(Aluno aluno);

    List<Aluno> listaAlunos();

    void excluirAluno(Integer id);

    List<Aluno> excluirAlunos();

}
