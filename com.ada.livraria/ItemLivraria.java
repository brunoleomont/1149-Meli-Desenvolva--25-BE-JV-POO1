package com.ada.livraria;

public abstract class ItemLivraria {
    private String titulo;
    private String autorOuEditor;
    private double preco;
    private int anoPublicacao;

    public ItemLivraria(String titulo, String autorOuEditor, double preco, int anoPublicacao) {
        this.titulo = titulo;
        this.autorOuEditor = autorOuEditor;
        // this.preco = preco;
        this.setPreco(preco);
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço deve ser maior que zero.");
        }
    }

    public String getAutorOuEditor() {
        return autorOuEditor;
    }

    public void setAutorOuEditor(String autorOuEditor) {
        this.autorOuEditor = autorOuEditor;
    }

    public void exibirInformacoesBasicas(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor/Editora: " + this.autorOuEditor);
        System.out.println("Preço R$: " + this.preco);
        System.out.println("Ano Publicação: " + this.anoPublicacao);
    }

    public abstract void exibirDetalhes();
}
