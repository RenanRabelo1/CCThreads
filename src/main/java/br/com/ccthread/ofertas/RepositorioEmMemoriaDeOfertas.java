package br.com.ccthread.ofertas;

import java.util.List;
import java.util.Optional;

public abstract class RepositorioEmMemoriaDeOfertas implements RepositorioDeOfertas {

    private List<Oferta> ofertas;

    public abstract void salvar(Oferta oferta);

    public abstract List<Oferta> listar();

    public abstract Optional<Oferta> buscarPorTitulo(String titulo);
}
