package com.inteligence.erp.model.entity.venda;

import com.inteligence.erp.model.entity.item.Item;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "venda")
public class Venda {

    public Venda() {
    }

    private Long id;
    private String tipoVenda;
    private Item item;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoVenda() {
        return tipoVenda;
    }

    public void setTipoVenda(String tipoVenda) {
        this.tipoVenda = tipoVenda;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
