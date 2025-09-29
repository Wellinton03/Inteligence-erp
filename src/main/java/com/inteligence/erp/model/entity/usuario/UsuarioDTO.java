package com.inteligence.erp.model.entity.usuario;

import com.inteligence.erp.model.entity.empresa.EmpresaDTO;

import java.time.LocalDateTime;

public class UsuarioDTO {

    public UsuarioDTO() {
    }

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.cpf = usuario.getCpf();
        this.empresa = new EmpresaDTO(usuario.getEmpresa());
        this.funcao = usuario.getFuncao();
        this.telefone = usuario.getTelefone();
        this.senha = usuario.getSenha();
        this.cidade = usuario.getCidade();
        this.email = usuario.getEmail();
        this.dtCriacao = usuario.getDtCriacao();
        this.dtAtualizacao = usuario.getDtAtualizacao();
    }

    private Long id;
    private String nome;
    private String cpf;
    private String senha;
    private EmpresaDTO empresa;
    private String funcao;
    private String telefone;
    private String cidade;
    private String email;
    private LocalDateTime dtCriacao;
    private LocalDateTime dtAtualizacao;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EmpresaDTO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaDTO empresa) {
        this.empresa = empresa;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDateTime dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public LocalDateTime getDtAtualizacao() {
        return dtAtualizacao;
    }

    public void setDtAtualizacao(LocalDateTime dtAtualizacao) {
        this.dtAtualizacao = dtAtualizacao;
    }
}
