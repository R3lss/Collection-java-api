package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemsLista;

    public CarrinhoDeCompras() {
        this.itemsLista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemsLista.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item i : itemsLista){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        itemsLista.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item i : itemsLista){
            total += (i.getPreco() * i.getQuantidade());
        }
        return total;
    }

    public void exibirItems(){
        System.out.println(itemsLista);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Maça", 1.99, 2);
        carrinho.adicionarItem("Maça", 1.99, 1);
        carrinho.adicionarItem("Pera", 1.99, 1);
        System.out.println(carrinho.calcularValorTotal());
        carrinho.exibirItems();
    }
}
