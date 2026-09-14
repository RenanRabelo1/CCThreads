package br.com.ccthread.ofertas;

import java.time.LocalDate;

public abstract class OfertaBase implements Oferta {

    protected String titulo;
    protected LocalDate dataEvento;

    public abstract String obterTitulo();

    public abstract LocalDate obterDataEvento();

    public abstract boolean aceitaInscricao();
}
