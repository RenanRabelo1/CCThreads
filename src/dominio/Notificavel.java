package br.com.ccthread.dominio;

public interface Notificavel {

    void receberAviso(String msg);

    Contato obterContato();
}
