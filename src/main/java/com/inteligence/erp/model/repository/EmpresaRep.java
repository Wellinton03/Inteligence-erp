package com.inteligence.erp.model.repository;

import com.inteligence.erp.model.entity.empresa.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRep extends JpaRepository<Empresa, Long> {

    // Define any custom query methods if needed
    // For example:
    // List<Empresa> findByNomeContaining(String nome);
}
