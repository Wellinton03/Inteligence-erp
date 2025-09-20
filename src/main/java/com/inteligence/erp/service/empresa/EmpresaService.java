package com.inteligence.erp.service.empresa;

import com.inteligence.erp.model.entity.empresa.Empresa;
import com.inteligence.erp.model.repository.EmpresaRepository;
import com.inteligence.erp.service.util.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpresaService implements IService<Empresa> {

    @Autowired
    private EmpresaRepository empresaRep;

    public EmpresaService() {
    }

    @Override
    @Transactional
    public void criar(Empresa empresa) {
        this.empresaRep.save(empresa);
    }

    @Override
    @Transactional
    public void atualizar(Empresa empresa) {
        this.empresaRep.save(empresa);
    }

    @Override
    @Transactional
    public void deletar(Long id) {
        this.empresaRep.deleteById(id);
    }

    @Override
    public Empresa buscarPorId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID inválido: " + id);
        }

        return this.empresaRep.findById(id).orElseThrow(() -> new RuntimeException("Empresa não encontrada com o ID: " + id));
    }

    @Override
    public List<Empresa> listartodos() {
        List<Empresa> empresas = this.empresaRep.findAll();

        if (empresas.isEmpty()) {
            throw new RuntimeException("Nenhuma empresa encontrada.");
        }

        return empresas;
    }
}
