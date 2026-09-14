package br.com.ccthread.inscricao;

import br.com.ccthread.dominio.Participante;
import br.com.ccthread.ofertas.Oferta;

import java.time.LocalDateTime;

public abstract class Inscricao {

    private Participante participante;
    private Oferta oferta;
    private LocalDateTime dataHora;
    private StatusInscricao status;

    public abstract Participante obterParticipante();

    public abstract Oferta obterOferta();

    public abstract boolean estaConfirmada();

    public abstract void cancelar();
}
