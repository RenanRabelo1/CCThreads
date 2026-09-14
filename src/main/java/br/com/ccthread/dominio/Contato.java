package br.com.ccthread.dominio;

public abstract class Contato {

    private String email;
    private String telefone;
    private String tokenPush;

    public abstract String obterEmail();

    public abstract String obterTelefone();

    public abstract String obterTokenPush();
}
