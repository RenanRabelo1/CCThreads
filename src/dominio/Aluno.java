package br.com.ccthread.dominio;

public abstract class Aluno implements Participante {

    private String matricula;
    private String nome;
    private Contato contato;

    public abstract String obterId();

    public abstract String obterNome();

    public abstract Contato obterContato();

    public abstract void receberAviso(String msg);
}
