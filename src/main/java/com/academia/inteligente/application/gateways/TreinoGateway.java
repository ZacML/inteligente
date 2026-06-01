package com.academia.inteligente.application.gateways;

import java.util.List;

import com.academia.inteligente.domain.Treino;

public interface TreinoGateway {
    Treino createTreino(Treino treino);

    List<Treino> listaTreinos();

    void excluirTreino(Integer id);

    List<Treino> excluirTreinos();

}
