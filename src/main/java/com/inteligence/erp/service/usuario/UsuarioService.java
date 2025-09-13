package com.inteligence.erp.service.usuario;

import com.inteligence.erp.model.entity.usuario.Usuario;
import com.inteligence.erp.model.repository.UsuarioRepository;
import com.inteligence.erp.service.evento.util.IService;

import java.util.List;

public class UsuarioService implements IService<Usuario> {

    private UsuarioRepository usuarioRep;

    public UsuarioService() {
    }

    @Override
    public void criar(Usuario evento) {
        usuarioRep.save(evento);
    }

    @Override
    public void atualizar(Usuario evento) {
        usuarioRep.save(evento);
    }

    @Override
    public void deletar(Long id) {
        usuarioRep.deleteById(id);
    }

    @Override
    public Usuario buscarPorId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID inválido: " + id);
        }

        return usuarioRep.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o ID: " + id));
    }

    @Override
    public List<Usuario> listartodos() {
        List<Usuario> usuarios = usuarioRep.findAll();

        if (usuarios.isEmpty()) {
            throw new RuntimeException("Nenhum usuário encontrado.");
        }

        return usuarios;
    }
}
