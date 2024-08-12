import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> removeItens = new ArrayList<>();

        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    removeItens.add(i);
                }
            }
            itemList.removeAll(removeItens);
        } else {
            System.out.println("O carrinho está vazio.");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                double valorItem = i.getPreco() * i.getQuatidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("O carrinho está vazio.");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("O carrinho está vazio.");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompas [itemList=" + itemList + "]";
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Caneta", 3, 2);
        carrinho.adicionarItem("Caderno", 10, 1);
        carrinho.adicionarItem("Borracha", 4, 3);
        carrinho.adicionarItem("Lapis", 2, 4);

        carrinho.exibirItens();

        carrinho.removerItem("Caderno");

        carrinho.exibirItens();

        System.out.println("Valor total: " + carrinho.calcularValorTotal());

    }
    
    
}
