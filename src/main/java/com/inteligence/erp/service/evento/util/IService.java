package com.inteligence.erp.service.evento.util;

import java.util.List;

public interface IService<T> {

    void criar (T entity);
    void atualizar (T entity);
    void deletar (Long id);
    T buscarPorId (Long id);
    List<T> listartodos();
}
