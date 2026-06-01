package com.academia.inteligente.application.gateways.use

import java.util.List;

import com.academia.inteligente.application.gateways.InstrutorGateway;
import com.academia.inteligente.domain.Instrutor;

public class InstrutorUseCase {

    private final InstrutorGateway gateway;

    public InstrutorUseCase(InstrutorGateway gateway) {
        this.gateway = gateway;
    }

    public Instrutor createInstrutor(Instrutor usuario) {
        return gateway.createInstrutor(usuario);
    }

    public List<Instrutor> listaInstrutor() {
        return gateway.listaInstrutor();
    }

    public void deleteInstrutor(Integer id) {
        gateway.deleteInstrutor(id);
    }
}
