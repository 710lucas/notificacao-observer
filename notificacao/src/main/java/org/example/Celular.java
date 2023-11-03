package org.example;

public class Celular implements NotificacaoListener{

    private CelularModos modo = CelularModos.SILENCIOSO;

    private User dono;

    public Celular(User dono){
        this.dono = dono;
    }

    public String notificationMusic(){
        return "♫♪♪♫♫♪♫♪♫♫♪♫";

    }

    public void setModo(CelularModos modo){
        this.modo = modo;
    }

    public void notificarNovaMensagem(NotificacaoEvent evento){
        String notificacao = "Nova notificacao...";
        if(modo == CelularModos.SOM)
            notificacao = notificationMusic()+"\nNova Mensagem -> "+evento.getNovaMensagem().getAutor().getNome()+": "+evento.getNovaMensagem().getConteudo();
        else if (modo == CelularModos.VIBRAR) {
            notificacao = "Nova mensagem -> "+evento.getNovaMensagem().getConteudo();
        }
        System.out.println("Celular de "+dono.getNome()+"    "+notificacao+"\n");
    }

    @Override
    public void novaMensagem(NotificacaoEvent evento) {
        if(evento.getNovaMensagem().getAutor() != dono)
            notificarNovaMensagem(evento);
    }
}
