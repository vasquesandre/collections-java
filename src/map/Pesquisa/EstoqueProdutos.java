package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quant, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quant));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuant() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getPreco() > maiorPreco) {
                produtoMaisCaro = p;
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MIN_VALUE;

        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getPreco() < menorPreco) {
                produtoMaisBarato = p;
            }
        }

        return produtoMaisBarato;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1001, "Produto A", 10, 5);
        estoque.adicionarProduto(1002, "Produto B", 5, 10);
        estoque.adicionarProduto(1003, "Produto C", 2, 15);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());

        estoque.obterProdutoMaisCaro();
        estoque.obterProdutoMaisBarato();
    }

}
