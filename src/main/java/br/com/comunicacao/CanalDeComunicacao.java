package br.com.ccthread.comunicacao;

import br.com.ccthread.dominio.Notificavel;

public interface CanalDeComunicacao {

    void enviar(String msg, Notificavel destino);
}
