package com.inteligence.erp.service.usuario;

import com.inteligence.erp.model.entity.usuario.Usuario;
import com.inteligence.erp.model.entity.usuario.UsuarioDTO;
import com.inteligence.erp.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRep;

    public UsuarioService() {
    }

    @Transactional
    public void criar(UsuarioDTO dto) {
        Usuario usuario = new Usuario(dto);
        this.usuarioRep.save(usuario);
    }

    @Transactional
    public void atualizar(UsuarioDTO dto) {
        Usuario usuario = new Usuario(dto);
        this.usuarioRep.save(usuario);
    }

    @Transactional
    public void deletar(Long id) {
        this.usuarioRep.deleteById(id);
    }

    public UsuarioDTO buscarPorId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID inválido: " + id);
        }
        return this.usuarioRep.findById(id).map(UsuarioDTO::new).orElseThrow(() -> new RuntimeException("Usuário não encontrado com o ID: " + id));
    }


    public List<UsuarioDTO> listarTodos() {
        List<UsuarioDTO> usuarios = this.usuarioRep.findAll().stream().map(UsuarioDTO::new).toList();
        if (usuarios.isEmpty()) {
            throw new RuntimeException("Nenhum usuário encontrado.");
        }
        return usuarios;
    }
}
