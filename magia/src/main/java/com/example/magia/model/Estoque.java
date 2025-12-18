package com.example.magia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Estoque")
public class Estoque {
    @Id
    @Column(name = "id_estoque")
    private String id;

    @Column(name = "produto")
    private String produto;

    @Column(name = "tipo")
    private boolean tipo;

    @Column(name = "quantidade")
    private int quantidade;

    @Column(name = "data")
    private Date data;

    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    @Column(name = "motivo")
    private String motivo;

    public Estoque() {}

    public Estoque(String id, String produto, boolean tipo, int quantidade,
                   Date data, Usuario usuario, String motivo) {
        this.id = id;
        this.produto = produto;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.data = data;
        this.usuario = usuario;
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "";
    }
}
