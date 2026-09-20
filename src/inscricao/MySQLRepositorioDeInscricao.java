package br.com.ccthread.inscricao;

import br.com.ccthread.dominio.Participante;
import br.com.ccthread.ofertas.Oferta;

import java.sql.Connection;
import java.util.List;

public abstract class MySQLRepositorioDeInscricao implements RepositorioDeInscricao {

    private Connection conexao;

    public abstract void salvar(Inscricao inscricao);

    public abstract List<Inscricao> buscarPorOferta(Oferta oferta);

    public abstract boolean existePor(Participante participante, Oferta oferta);
}
