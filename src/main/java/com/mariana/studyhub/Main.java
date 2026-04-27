package com.mariana.studyhub;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double preco = sc.nextDouble();
        int quantidade = sc.nextInt();
        int quantidadeVendida = sc.nextInt();

        //NEW OBJETO
        Produto produto = new Produto(nome, preco, quantidade);

        //MÉTODOS
        produto.exibirProduto();
        produto.realizarVenda(quantidadeVendida);

        //CLOSE
        sc.close();
    }
}