package com.inteligence.erp.controller.util;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface IController<T> {

    ResponseEntity listarTodos(@RequestBody T entity );
    ResponseEntity listarPorId(@RequestBody Long id );
    ResponseEntity criar(@RequestBody T entity );
    ResponseEntity atualizar(@RequestBody T entity );
    ResponseEntity deletar(@RequestBody Long id );
}
