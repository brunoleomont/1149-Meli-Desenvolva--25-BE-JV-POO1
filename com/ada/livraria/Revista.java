package com.ada.livraria;

public class Revista extends ItemLivraria{
    private int edicao;
    private String periodicidade;

    public Revista(String titulo, String autorOuEditor, double preco, int anoPublicacao, int edicao, String periodicidade) {
        super(titulo, autorOuEditor, preco, anoPublicacao);
        this.edicao = edicao;
        this.periodicidade = periodicidade;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public void exibirDetalhes() {
        this.exibirInformacoesBasicas();
        System.out.println("Edição: " + this.edicao);
        System.out.println("Periodicidade: " + this.periodicidade);
    }
}
