package br.com.ccthread.inscricao;

import br.com.ccthread.dominio.Participante;
import br.com.ccthread.ofertas.Oferta;

import java.util.List;

public interface RepositorioDeInscricao {

    void salvar(Inscricao inscricao);

    List<Inscricao> buscarPorOferta(Oferta oferta);

    boolean existePor(Participante participante, Oferta oferta);
}
