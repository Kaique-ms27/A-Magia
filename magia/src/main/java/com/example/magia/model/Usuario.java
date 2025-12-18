package com.example.magia.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @Column(name = "id_usuario")
    private int usuario;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "role")
    private boolean admin;

    public Usuario () {}

    public Usuario(int usuario, String nome, String email, String senha,
                   boolean admin) {
        this.usuario = usuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "";
    }
}
