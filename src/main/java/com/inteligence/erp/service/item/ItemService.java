package com.inteligence.erp.service.item;

import com.inteligence.erp.model.entity.item.Item;
import com.inteligence.erp.model.repository.ItemRepository;
import com.inteligence.erp.service.evento.util.IService;

import java.util.List;

public class ItemService implements IService<Item> {

    private ItemRepository itemRep;

    public ItemService() {
    }

    @Override
    public void criar(Item item) {
        itemRep.save(item);
    }

    @Override
    public void atualizar(Item item) {
        itemRep.save(item);
    }

    @Override
    public void deletar(Long id) {
        itemRep.deleteById(id);
    }

    @Override
    public Item buscarPorId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID inválido: " + id);
        }

        return itemRep.findById(id)
                .orElseThrow(() -> new RuntimeException("Item não encontrado com o ID: " + id));
    }

    @Override
    public List<Item> listartodos() {
        List<Item> items = itemRep.findAll();

        if (items.isEmpty()) {
            throw new RuntimeException("Nenhum item encontrado.");
        }

        return items;
    }
}
