package com.inteligence.erp.controller.usuario;

import com.inteligence.erp.controller.util.IController;
import com.inteligence.erp.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController implements IController {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public ResponseEntity listarTodos(Object entity) {
        return null;
    }

    @Override
    public ResponseEntity listarPorId(Long id) {
        return null;
    }

    @Override
    public ResponseEntity criar(Object entity) {
        return null;
    }

    @Override
    public ResponseEntity atualizar(Object entity) {
        return null;
    }

    @Override
    public ResponseEntity deletar(Long id) {
        return null;
    }
}
