package com.ada.livraria;

public class Livro extends ItemLivraria{
    private String isbn;
    private int numeroPaginas;

    public Livro(String titulo, String autorOuEditor, double preco, int anoPublicacao, String isbn, int numeroPaginas) {
        super(titulo, autorOuEditor, preco, anoPublicacao);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirDetalhes() {
        // System.out.println("Titulo: " + this.getTitulo());
        this.exibirInformacoesBasicas();
//        super.exibirInformacoesBasicas();
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Páginas: " + this.numeroPaginas);
    }
}
