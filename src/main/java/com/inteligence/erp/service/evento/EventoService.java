package com.inteligence.erp.service.evento;

import com.inteligence.erp.model.entity.evento.Evento;
import com.inteligence.erp.model.repository.EventoRepository;
import com.inteligence.erp.service.evento.util.IService;

import java.util.List;

public class EventoService implements IService<Evento> {

    private EventoRepository eventoRep;

    public EventoService() {
    }

    @Override
    public void criar(Evento evento) {
        eventoRep.save(evento);
    }

    @Override
    public void atualizar(Evento evento) {
        eventoRep.save(evento);
    }

    @Override
    public void deletar(Long id) {
        eventoRep.deleteById(id);
    }

    @Override
    public Evento buscarPorId(Long id) {
        if(id == null) {
            throw new IllegalArgumentException("ID inválido: " + id);
        }

        return eventoRep.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento não encontrado com o ID: " + id));
    }

    @Override
    public List<Evento> listartodos() {
        List<Evento> eventos = eventoRep.findAll();

        if(eventos.isEmpty()) {
            throw new RuntimeException("Nenhum evento encontrado.");
        }

        return eventos;
    }
}
