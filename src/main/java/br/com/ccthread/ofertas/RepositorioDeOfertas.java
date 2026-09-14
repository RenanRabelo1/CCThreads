package br.com.ccthread.ofertas;

import java.util.List;
import java.util.Optional;

public interface RepositorioDeOfertas {

    void salvar(Oferta oferta);

    List<Oferta> listar();

    Optional<Oferta> buscarPorTitulo(String titulo);
}
