package org.example;

public class NotificacaoEvent {

    private Mensagem novaMensagem;

    public NotificacaoEvent(Mensagem mensagem){
        this.novaMensagem = mensagem;
    }

    public Mensagem getNovaMensagem() {
        return novaMensagem;
    }

    public void setNovaMensagem(Mensagem novaMensagem) {
        this.novaMensagem = novaMensagem;
    }
}
