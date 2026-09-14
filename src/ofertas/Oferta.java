package br.com.ccthread.ofertas;

import java.time.LocalDate;

public interface Oferta {

    String obterTitulo();

    LocalDate obterDataEvento();

    boolean aceitaInscricao();
}
