package com.inteligence.erp.model.repository;

import com.inteligence.erp.model.entity.compra.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRep extends JpaRepository<Compra, Long> {
}
