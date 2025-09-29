package com.inteligence.erp.model.entity.evento;

import com.inteligence.erp.model.entity.usuario.Usuario;
import com.inteligence.erp.model.enun.StatusEvento;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name= "evento")
public class Evento {

    public Evento() {
    }

    public Evento(EventoDTO dto) {
        this.id = dto.getId();
        this.statusEvento = dto.getStatusEvento();
        this.tipoProblema = dto.getTipoProblema();
        this.descricao = dto.getDescricao();
        this.relator = dto.getRelator();
        this.responsavel = dto.getResponsavel();
        this.setorResponsavel = dto.getSetorResponsavel();
        this.dtAlteracao = dto.getDtAlteracao();
        this.dtInclusao = dto.getDtInclusao();
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

    @ManyToOne
    @JoinColumn(name = "relator")
    private Usuario relator;

    @ManyToOne
    @JoinColumn(name = "responsavel")
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
