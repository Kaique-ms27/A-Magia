package com.example.magia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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


    public void setQuantidadeAtual(int quantidadeAtual) {
        if (quantidadeMinima < 0) {
            System.out.println("Quantidade inválida");
        }
        this.quantidadeMinima = quantidadeAtual;
    }


    public String toStrig() {
        return "id_produto: " + id + ",/n" +
                "nome: " + nome + ",/n" +
                "descriao: " + descricao + ",/n" +
                "categoria: " + categoria + ",/n" +
                "quantidade_atual: " + quantidadeAtual + ",/n" +
                "quantidade_minima: " + quantidadeMinima + ",/n" +
                "aitvacao: " + ativacao + ",/n";
    }
}
