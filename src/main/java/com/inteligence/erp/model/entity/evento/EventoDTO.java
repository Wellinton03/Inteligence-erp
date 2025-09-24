package com.inteligence.erp.model.entity.evento;

import com.inteligence.erp.model.entity.usuario.Usuario;
import com.inteligence.erp.model.enun.StatusEvento;

import java.time.LocalDateTime;

public class EventoDTO {

    public EventoDTO() {
    }

    public EventoDTO(Evento evento) {
        this.id = evento.getId();
        this.statusEvento = evento.getStatusEvento();
        this.tipoProblema = evento.getTipoProblema();
        this.descricao = evento.getDescricao();
        this.relator = evento.getRelator();
        this.responsavel = evento.getResponsavel();
        this.setorResponsavel = evento.getSetorResponsavel();
        this.dtAlteracao = evento.getDtAlteracao();
        this.dtInclusao = evento.getDtInclusao();
    }

    private Long id;
    private StatusEvento statusEvento;
    private String tipoProblema;
    private String descricao;
    private Usuario relator;
    private Usuario responsavel;
    private String setorResponsavel;
    private LocalDateTime dtAlteracao;
    private LocalDateTime dtInclusao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatusEvento getStatusEvento() {
        return statusEvento;
    }

    public void setStatusEvento(StatusEvento statusEvento) {
        this.statusEvento = statusEvento;
    }

    public String getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(String tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getRelator() {
        return relator;
    }

    public void setRelator(Usuario relator) {
        this.relator = relator;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }

    public LocalDateTime getDtAlteracao() {
        return dtAlteracao;
    }

    public void setDtAlteracao(LocalDateTime dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
    }

    public LocalDateTime getDtInclusao() {
        return dtInclusao;
    }

    public void setDtInclusao(LocalDateTime dtInclusao) {
        this.dtInclusao = dtInclusao;
    }
}
