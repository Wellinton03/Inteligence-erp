package com.inteligence.erp.service.empresa;

import com.inteligence.erp.model.entity.empresa.Empresa;
import com.inteligence.erp.model.repository.EmpresaRepository;
import com.inteligence.erp.service.evento.util.IService;

import java.util.List;

public class EmpresaService implements IService<Empresa> {

    private EmpresaRepository empresaRep;

    public EmpresaService() {
    }

    @Override
    public void criar(Empresa empresa) {
        empresaRep.save(empresa);
    }

    @Override
    public void atualizar(Empresa empresa) {
        empresaRep.save(empresa);
    }

    @Override
    public void deletar(Long id) {
        empresaRep.deleteById(id);
    }

    @Override
    public Empresa buscarPorId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID inválido: " + id);
        }

        return empresaRep.findById(id).orElseThrow(() -> new RuntimeException("Empresa não encontrada com o ID: " + id));
    }

    @Override
    public List<Empresa> listartodos() {
        List<Empresa> empresas = empresaRep.findAll();

        if (empresas.isEmpty()) {
            throw new RuntimeException("Nenhuma empresa encontrada.");
        }

        return empresas;
    }
}
