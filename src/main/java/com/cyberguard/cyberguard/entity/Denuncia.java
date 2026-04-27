package com.cyberguard.cyberguard.entity;

import jakarta.persistence.*;

@Entity
public class Denuncia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    public Denuncia() {}

    public Denuncia(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // getters e setters
    public Long getId() { return id; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }
}