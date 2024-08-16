package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quant) {
        produtoSet.add(new Produto(cod, nome, preco, quant));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtosPorPreco.addAll(produtoSet);

        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadProd = new CadastroProdutos();

        cadProd.adicionarProduto(1001, "Leite", 7, 4);
        cadProd.adicionarProduto(1004, "Bolacha", 3, 6);
        cadProd.adicionarProduto(1002, "Carne", 30, 2);
        cadProd.adicionarProduto(1005, "Torta", 14, 1);
        cadProd.adicionarProduto(1003, "Pipoca", 5, 5);

        System.out.println(cadProd.produtoSet);
        System.out.println(cadProd.exibirPorPreco());
        System.out.println(cadProd.exibirProdutosPorNome());
    }


}
