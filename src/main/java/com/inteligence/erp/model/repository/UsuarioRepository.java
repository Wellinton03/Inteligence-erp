package com.inteligence.erp.model.repository;

import com.inteligence.erp.model.entity.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Define any custom query methods if needed
    // For example:
    // List<Usuario> findByNomeContaining(String nome);
}
