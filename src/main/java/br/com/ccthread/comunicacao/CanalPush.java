package br.com.ccthread.comunicacao;

import br.com.ccthread.dominio.Notificavel;

public abstract class CanalPush implements CanalDeComunicacao {

    private String tokenServidor;

    public abstract void enviar(String msg, Notificavel destino);
}
