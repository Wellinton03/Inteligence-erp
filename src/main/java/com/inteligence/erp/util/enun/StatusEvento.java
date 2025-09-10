package com.inteligence.erp.util.enun;

public enum StatusEvento {
    A_FAZER(1, "A Fazer"),
    EM_ANDAMENTO(2, "Em Andamento"),
    CONCLUIDO(3, "Concluído"),
    CANCELADO(4, "Cancelado");

    private final int codigo;
    private final String descricao;

    StatusEvento(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    // Utilitário para buscar enum pelo código
    public static StatusEvento fromCodigo(int codigo) {
        for (StatusEvento status : StatusEvento.values()) {
            if (status.getCodigo() == codigo) {
                return status;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}

