package br.com.ccthread.apresentacao;

import java.util.List;

public abstract class VitrineDeProjetos {

    private List<Visualizavel> itens;

    public abstract void adicionar(Visualizavel item);

    public abstract void exibirTodos();
}
