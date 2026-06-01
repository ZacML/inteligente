package com.academia.inteligente.application.gateways;

import java.util.List;

import com.academia.inteligente.domain.Instrutor;

public interface InstrutorGateway {

    Instrutor createInstrutor(Instrutor instrutor);

    List<Instrutor> listaInstrutor();

    void excluirInstrutor(Integer id);

    List<Instrutor> excluirInstrutores();
}
