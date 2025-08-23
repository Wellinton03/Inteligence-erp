package com.inteligence.erp.model.entity.compra;

import com.inteligence.erp.model.entity.item.Item;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "compra")
public class Compra {

    public Compra() {
    }

    private Long id;
    private String tipoCompra;
    private Item item;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
