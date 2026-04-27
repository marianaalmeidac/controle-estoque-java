package com.mariana.studyhub;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
    }

    public void realizarVenda(int quantidadeVendida) {
        System.out.println("Estoque antes da venda: " + quantidade + " unidades");

        if (quantidadeVendida > quantidade) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            quantidade -= quantidadeVendida;
            System.out.println("Venda realizada: " + quantidadeVendida + " unidades");
            System.out.println("Estoque atualizado: " + quantidade + " unidades");
        }
    }
}
