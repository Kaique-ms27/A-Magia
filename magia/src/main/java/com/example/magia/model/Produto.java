package com.example.magia.model;

import com.example.magia.dto.request.ProdutoDTORequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
@Entity
@Table(name = "Produto")
public class Produto {

    @Id
    @Column(name = "id_produto")
    private String id;

    @Column(name = "nome_produto")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "categoria")
    private int categoria;

    @Column(name = "quantidade_atual")
    private int quantidadeAtual;

    @Column(name = "quantidade_minima")
    private int quantidadeMinima;

    @Column(name = "ativacao")
    private boolean ativacao;

    public Produto() {}

    public Produto(ProdutoDTORequest produtoDTORequest) {
        BeanUtils.copyProperties(produtoDTORequest, this);
    }

    public Produto(String nome, String descricao, int categoria,
                   int  quantidadeAtual, int quantidadeMinima,
                   boolean ativacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
        this.ativacao = ativacao;
    }

    @Override
    public String toString() {
        return "id_produto: " + id + ",/n" +
                "nome: " + nome + ",/n" +
                "descriao: " + descricao + ",/n" +
                "categoria: " + categoria + ",/n" +
                "quantidade_atual: " + quantidadeAtual + ",/n" +
                "quantidade_minima: " + quantidadeMinima + ",/n" +
                "aitvacao: " + ativacao + ",/n";
    }
}
