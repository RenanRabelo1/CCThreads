package br.com.ccthread.comunicacao;

import br.com.ccthread.dominio.Notificavel;

import java.util.List;

public abstract class ServicoDeComunicacao {

    private CanalDeComunicacao canal;

    public abstract void notificar(Notificavel destino, String msg);

    public abstract void publicarAviso(List<Notificavel> destinos, String msg);
}
