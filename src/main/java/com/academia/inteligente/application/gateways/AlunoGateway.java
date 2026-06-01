package com.academia.inteligente.application.gateways;

public interface AlunoGateway {

    Aluno createAluno(Aluno usuario);

    List<Usuario> listaUsuarios();

    void excluirUsuario(Integer id);

    List<Usuario> excluirUsuarios();

    Usuario updateUsuario(Integer id, Usuario usuario);

}
