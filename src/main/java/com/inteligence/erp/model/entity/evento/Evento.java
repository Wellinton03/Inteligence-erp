package com.inteligence.erp.model.entity.evento;

import com.inteligence.erp.model.entity.usuario.Usuario;
import com.inteligence.erp.util.enun.StatusEvento;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name= "evento")
public class Evento {

    public Evento() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status_evento")
    private StatusEvento statusEvento;

    @Column(name= "tipo_problema")
    private String tipoProblema;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "relator")
    private Usuario relator;

    @Column(name = "responsavel")
    private Usuario responsavel;

    @Column(name = "setor_responsavel")
    private String setorResponsavel;

    @Column(name = "dt_alt")
    private LocalDateTime dtAlteracao;

    @Column(name = "dt_inc")
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
