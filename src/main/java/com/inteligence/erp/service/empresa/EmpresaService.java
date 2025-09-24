package com.inteligence.erp.service.empresa;

import com.inteligence.erp.model.entity.empresa.Empresa;
import com.inteligence.erp.model.entity.empresa.EmpresaDTO;
import com.inteligence.erp.model.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRep;

    public EmpresaService() {
    }

    @Transactional
    public void criar(EmpresaDTO dto) {
        Empresa empresa = new Empresa(dto);
        this.empresaRep.save(empresa);
    }

    @Transactional
    public void atualizar(EmpresaDTO dto) {
        Empresa empresa = new Empresa(dto);
        this.empresaRep.save(empresa);
    }

    @Transactional
    public void deletar(Long id) {
        this.empresaRep.deleteById(id);
    }

    public EmpresaDTO buscarPorId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID inválido: " + id);
        }
        return this.empresaRep.findById(id).map(EmpresaDTO::new).orElseThrow(() -> new RuntimeException("Empresa não encontrada com o ID: " + id));
    }

    public List<EmpresaDTO> listartodos() {
        List<EmpresaDTO> empresas = this.empresaRep.findAll().stream().map(EmpresaDTO::new).toList();
        if (empresas.isEmpty()) {
            throw new RuntimeException("Nenhuma empresa encontrada.");
        }
        return empresas;
    }
}
