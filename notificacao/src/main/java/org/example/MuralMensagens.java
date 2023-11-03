package org.example;

import java.util.ArrayList;
import java.util.List;

public class MuralMensagens implements NotificacaoListener{

    private List<Mensagem> mensagens = new ArrayList<>();

    public void addMensagem(NotificacaoEvent evento){
        this.mensagens.add(evento.getNovaMensagem());
    }

    @Override
    public void novaMensagem(NotificacaoEvent evento) {
        addMensagem(evento);
    }
}
