package br.com.ccthread.ofertas;

import java.util.List;

public abstract class ListadorDeOfertas {

    private RepositorioDeOfertas repositorio;

    public abstract List<Oferta> listarOfertas();
}
