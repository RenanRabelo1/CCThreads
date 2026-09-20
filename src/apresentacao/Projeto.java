package br.com.ccthread.apresentacao;

import br.com.ccthread.ofertas.Oferta;

import java.util.List;

public abstract class Projeto implements Visualizavel {

    private String titulo;
    private String resumo;
    private List<String> midias;
    private Oferta origem;

    public abstract String obterResumo();

    public abstract List<String> obterMidias();

    public abstract Oferta obterOrigem();
}
