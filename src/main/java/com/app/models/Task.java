package com.app.models;

public class Task {
    private long id;
    private String nome;
    private String descricao;
    private String dataCriacao;
    private String dataConclusao;
    private boolean concluido;

    public Task() {
    }

    public Task(long id, String nome, String descricao, String dataCriacao, String dataConclusao, boolean concluido) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        this.concluido = concluido;
    }

    // getters

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public boolean getConcluido() {
        return concluido;
    }

    // setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
}

