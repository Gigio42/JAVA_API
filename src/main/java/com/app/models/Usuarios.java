package com.app.models;

public class Usuarios {
    private int id;
    private String nome;
    private String password;

    public void Usuarios (String nome, int id, String password) {
        this.nome = nome;
        this.id = id;
        this.password = password;
    }

    public String getNome(){
        return this.nome;
    }

    public int getId() {
        return this.id;
    }

    public String getPassword(){
        return this.password;
    }

    public void setNome(){
        this.nome = nome;
    }

    public void setId(){
        this.password = password;
    }
}


