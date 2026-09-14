package br.com.ccthread.ofertas;

public abstract class CatalogadorDeOfertas {

    private RepositorioDeOfertas repositorio;

    public abstract void catalogar(Oferta oferta);
}
