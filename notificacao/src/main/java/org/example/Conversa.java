package org.example;

import java.util.ArrayList;
import java.util.List;

public class Conversa {

    private List<User> usuarios = new ArrayList<>();
    private List<Mensagem> mensagens = new ArrayList<>();

    private List<NotificacaoListener> notificadores = new ArrayList<>();

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void addNotificador(NotificacaoListener notificador){
        this.notificadores.add(notificador);
    }

    public List<User> getUsuarios() {
        return usuarios;
    }

    public void addMensagem(String mensagem, User autor){
        mensagens.add(new Mensagem(mensagem, autor));
        NotificacaoEvent event = new NotificacaoEvent(new Mensagem(mensagem, autor));
        for(NotificacaoListener not : notificadores)
            not.novaMensagem(event);
    }

    public void addUsuario(User usuario){
        this.usuarios.add(usuario);
    }

    public void removerFuncionario(User usuario){
        usuarios.remove(usuario);
    }



}
