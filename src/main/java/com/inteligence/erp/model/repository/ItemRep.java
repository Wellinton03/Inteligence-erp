package com.inteligence.erp.model.repository;

import com.inteligence.erp.model.entity.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRep extends JpaRepository<Item, Long> {
}
