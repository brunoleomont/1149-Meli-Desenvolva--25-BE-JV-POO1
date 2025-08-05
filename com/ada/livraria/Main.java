package com.ada.livraria;

public class Main {
    public static void main(String[] args) {
        Livro meuLivro = new Livro(
                "O Senhor dos Anéis",
                "J.R.R. Tolkien",
                75.50,
                1954,
                "978-85-336-0314-9",
                1200);

        System.out.println("<--- Meu Livro --->");
        meuLivro.exibirDetalhes();

        System.out.println("----------------------");

        Revista minhaRevista = new Revista(
                "National Geographic",
                "National Geographic Society",
                -25.00,
                2024,
                105,
                "Mensal");

        minhaRevista.setPreco(25);
        System.out.println("<--- Minha Revista --->");
        minhaRevista.exibirDetalhes();

        System.out.println("----------------------");

        Ebook meuEbook = new Ebook(
                "Clean Code",
                "Robert C. Martin",
                49.99,
                2008,
                "PDF",
                15.7
        );

        System.out.println("<--- Meu Ebook --->");
        meuEbook.exibirDetalhes();
    }
}
