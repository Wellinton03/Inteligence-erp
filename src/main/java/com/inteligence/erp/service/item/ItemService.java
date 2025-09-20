package com.inteligence.erp.service.item;

import com.inteligence.erp.model.entity.item.Item;
import com.inteligence.erp.model.repository.ItemRepository;
import com.inteligence.erp.service.util.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemService implements IService<Item> {

    @Autowired
    private ItemRepository itemRep;

    public ItemService() {
    }

    @Override
    @Transactional
    public void criar(Item item) {
        this.itemRep.save(item);
    }

    @Override
    @Transactional
    public void atualizar(Item item) {
        this.itemRep.save(item);
    }

    @Override
    @Transactional
    public void deletar(Long id) {
        this.itemRep.deleteById(id);
    }

    @Override
    public Item buscarPorId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID inválido: " + id);
        }

        return this.itemRep.findById(id)
                .orElseThrow(() -> new RuntimeException("Item não encontrado com o ID: " + id));
    }

    @Override
    public List<Item> listartodos() {
        List<Item> items = this.itemRep.findAll();

        if (items.isEmpty()) {
            throw new RuntimeException("Nenhum item encontrado.");
        }

        return items;
    }
}
