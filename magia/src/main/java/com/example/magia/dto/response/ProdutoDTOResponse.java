package com.example.magia.dto.response;

import lombok.Data;

@Data
public class ProdutoDTOResponse {
    private String id;
    private String nome;
    private String descricao;
    private int categoria;
    private int quantidadeAtual;
    private int quantidadeMinima = 10;
    private boolean ativacao = false;

    public ProdutoDTOResponse(String nome, String descricao, int categoria,
                              int  quantidadeAtual, int quantidadeMinima,
                              boolean ativacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
        this.ativacao = ativacao;
    }

    public ProdutoDTOResponse() {}
}
