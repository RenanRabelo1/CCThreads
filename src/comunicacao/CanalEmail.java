package br.com.ccthread.comunicacao;

import br.com.ccthread.dominio.Notificavel;

public abstract class CanalEmail implements CanalDeComunicacao {

    private String servidorSmtp;

    public abstract void enviar(String msg, Notificavel destino);
}
