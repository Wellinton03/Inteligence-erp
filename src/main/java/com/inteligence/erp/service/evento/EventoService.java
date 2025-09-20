package com.inteligence.erp.service.evento;

import com.inteligence.erp.model.entity.evento.Evento;
import com.inteligence.erp.model.repository.EventoRepository;
import com.inteligence.erp.service.util.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventoService implements IService<Evento> {

    @Autowired
    private EventoRepository eventoRep;

    public EventoService() {
    }

    @Override
    @Transactional
    public void criar(Evento evento) {
        this.eventoRep.save(evento);
    }

    @Override
    @Transactional
    public void atualizar(Evento evento) {
        this.eventoRep.save(evento);
    }

    @Override
    @Transactional
    public void deletar(Long id) {
        this.eventoRep.deleteById(id);
    }

    @Override
    public Evento buscarPorId(Long id) {
        if(id == null) {
            throw new IllegalArgumentException("ID inválido: " + id);
        }

        return this.eventoRep.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento não encontrado com o ID: " + id));
    }

    @Override
    public List<Evento> listartodos() {
        List<Evento> eventos = this.eventoRep.findAll();

        if(eventos.isEmpty()) {
            throw new RuntimeException("Nenhum evento encontrado.");
        }

        return eventos;
    }
}
