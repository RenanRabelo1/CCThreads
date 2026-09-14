package br.com.ccthread.inscricao;

import br.com.ccthread.dominio.Participante;

import java.util.List;

public interface Inscrivel {

    Inscricao inscrever(Participante participante);

    boolean temVagaDisponivel();

    List<Inscricao> obterInscricoes();
}
