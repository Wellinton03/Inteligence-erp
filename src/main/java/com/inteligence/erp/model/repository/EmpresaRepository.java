package com.inteligence.erp.model.repository;

import com.inteligence.erp.model.entity.empresa.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
