package com.inteligence.erp.model.repository;

import com.inteligence.erp.model.entity.evento.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
