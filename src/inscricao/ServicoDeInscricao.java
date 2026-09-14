package br.com.ccthread.inscricao;

import br.com.ccthread.comunicacao.ServicoDeComunicacao;
import br.com.ccthread.dominio.Participante;

public abstract class ServicoDeInscricao {

    private RepositorioDeInscricao repositorio;
    private ServicoDeComunicacao notificador;

    public abstract Inscricao registrar(Participante participante, Inscrivel oferta);
}
