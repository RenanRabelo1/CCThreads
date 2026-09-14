package br.com.ccthread.comunicacao;

import br.com.ccthread.dominio.Notificavel;

public abstract class CanalSMS implements CanalDeComunicacao {

    private String gatewaySms;

    public abstract void enviar(String msg, Notificavel destino);
}
