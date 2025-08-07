package com.ada.livraria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livraria {
    private List<ItemLivraria> itensLivraria;
    private Scanner scanner;

    public Livraria() {
        this.itensLivraria = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("---Menu---");
            System.out.println("1. Cadastrar Livro: ");
            System.out.println("2. Buscar item: ");
            System.out.println("3. Listar itens: ");
            System.out.println("4. Deletar item: ");
            System.out.println("5. Editar item: ");
            System.out.println("0. Sair");
            System.out.println("Escolha sua Opção:");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarItemLivraria();
                    break;
                case 2:
                    buscarItem();
                    break;
                case 3:
                    listarItens();
                    break;
                case 4:
                    System.out.println("Ainda não implementada...");
                    break;
                case 5:
                    editarItem();
                    break;
                case 0:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }

    private void editarItem() {
        System.out.println("---Editar Item---");
        System.out.println("Digite o título do livro a ser alterado: ");
        String tituloParaEditar = scanner.nextLine();

        ItemLivraria itemEncontrado = buscarItemPorTitulo(tituloParaEditar);

        if (itemEncontrado != null) {
            System.out.println("---Informe os novos dados do item---");
            System.out.println("Digite o novo título: ");
            String novoTitulo = scanner.nextLine();

            // salvando
            itemEncontrado.setTitulo(novoTitulo);
        } else {
            System.out.println("Item com esse título não localizado...");
        }
    }

    public void cadastrarItemLivraria() {
        System.out.println("---Informe os dados do novo item---");
        System.out.println("Digite o título: ");
        String titulo = scanner.nextLine();
        System.out.println("Digite o autor: ");
        String autor = scanner.nextLine();
        System.out.println("Digite o preço: ");
        double preco = scanner.nextDouble();
        System.out.println("Digite o ano de publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("Digite o número de páginas: ");
        int paginas = scanner.nextInt();
        ItemLivraria livro = new Livro(titulo, autor, preco, ano, isbn, paginas);
        adicionarItemLivraria(livro);
        System.out.println("Item cadastrado com sucesso!\n");
    }

    public void adicionarItemLivraria(ItemLivraria itemLivraria){
        this.itensLivraria.add(itemLivraria);
    }

    public void listarItens() {
        for (int i = 0; i < itensLivraria.size(); i++) {
            System.out.println("Item: " + (i+1));
            this.itensLivraria.get(i).exibirDetalhes();
        }
    }

    public void buscarItem() {
        System.out.println("---Informe o Título do item---");
        System.out.println("Digite o título: ");
        String titulo = scanner.nextLine();
        ItemLivraria itemRetornado = buscarItemPorTitulo(titulo);
        if (itemRetornado != null) {
            itemRetornado.exibirDetalhes();
        }
    }

    public ItemLivraria buscarItemPorTitulo(String titulo) {
        for (ItemLivraria item : this.itensLivraria) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Encontrei o item: ");
                return item;
            }
        }
        System.out.println("Item não localizado");
        return null;
    }
}
