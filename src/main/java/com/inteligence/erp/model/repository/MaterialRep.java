package com.inteligence.erp.model.repository;

import com.inteligence.erp.model.entity.material.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRep extends JpaRepository<Material, Long> {
}
