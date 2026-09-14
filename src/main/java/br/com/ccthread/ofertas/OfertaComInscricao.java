package br.com.ccthread.ofertas;

import br.com.ccthread.dominio.Participante;
import br.com.ccthread.inscricao.Inscricao;

import java.util.List;

public abstract class OfertaComInscricao extends OfertaBase {

    protected List<Inscricao> inscricoes;

    public abstract Inscricao inscrever(Participante participante);

    public abstract List<Inscricao> obterInscricoes();

    public abstract boolean aceitaInscricao();

    public abstract boolean temVagaDisponivel();
}
