package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String nome;

    private List<Mensagem> mensagens = new ArrayList<>();

    public User(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addMensagem(Mensagem mensagem) {
        this.mensagens.add(mensagem);
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }
}
