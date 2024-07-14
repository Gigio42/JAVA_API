package com.app.models;

public class Users {
    private int id;
    private String user;
    private String password;

    public void Users (int id, String user, String password) {
        this.user = user;
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
        this.user = user;
    }

    public void setId(){
        this.password = password;
    }
}


