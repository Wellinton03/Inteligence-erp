package com.inteligence.erp.service.usuario;

import com.inteligence.erp.model.entity.usuario.Usuario;
import com.inteligence.erp.model.repository.UsuarioRepository;
import com.inteligence.erp.service.util.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService implements IService<Usuario> {

    @Autowired
    private UsuarioRepository usuarioRep;

    public UsuarioService() {
    }

    @Override
    @Transactional
    public void criar(Usuario evento) {
        this.usuarioRep.save(evento);
    }

    @Override
    @Transactional
    public void atualizar(Usuario evento) {
        this.usuarioRep.save(evento);
    }

    @Override
    @Transactional
    public void deletar(Long id) {
        this.usuarioRep.deleteById(id);
    }

    @Override
    public Usuario buscarPorId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID inválido: " + id);
        }

        return this.usuarioRep.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o ID: " + id));
    }

    @Override
    public List<Usuario> listartodos() {
        List<Usuario> usuarios = this.usuarioRep.findAll();

        if (usuarios.isEmpty()) {
            throw new RuntimeException("Nenhum usuário encontrado.");
        }

        return usuarios;
    }
}
