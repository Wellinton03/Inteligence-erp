package com.inteligence.erp.model.repository;

import com.inteligence.erp.model.entity.venda.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRep extends JpaRepository<Venda, Long> {
}
