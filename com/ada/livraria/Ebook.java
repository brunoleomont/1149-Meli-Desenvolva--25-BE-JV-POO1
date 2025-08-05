package com.ada.livraria;

public class Ebook extends ItemLivraria{
    private String formato;
    private double tamanhoArquivoMB;

    public Ebook(String titulo, String autorOuEditor, double preco, int anoPublicacao, String formato, double tamanhoArquivoMB) {
        super(titulo, autorOuEditor, preco, anoPublicacao);
        this.formato = formato;
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    public void exibirDetalhes() {
        this.exibirInformacoesBasicas();
        System.out.println("Formato: " + this.formato);
        System.out.println("Tamanho em MB: " + this.tamanhoArquivoMB);
    }
}
