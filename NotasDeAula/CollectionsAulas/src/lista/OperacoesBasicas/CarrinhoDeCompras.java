package lista.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> lista = new ArrayList<>();
	
	//Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
	public void adicionarItem(String nome, double preco, int quantidade){
		lista.add(new Item(nome, quantidade , preco));
	}
	
	//Remove um item do carrinho com base no seu nome.
	public void removerItem(String nome){
		for(Item i : lista) {
			if(i.getNome().equalsIgnoreCase(nome)) lista.remove(i);
		}
	}
	
	//Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
	public double calcularValorTotal() {
		double total = 0;
		for (Item i : lista) {
			total += i.getQuantidade() * i.getValor();
		}
		return total;
	}
	
	//Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
	public void exibirItens() {
		System.out.println("Itens no carrinho:" + lista);
	}


	public static void main(String[] args) {
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionarItem("manteiga", 10, 1);
		c1.adicionarItem("pão", 2.50 , 2);
		c1.exibirItens();
		System.out.println("Valor total: " + c1.calcularValorTotal());
		c1.removerItem("manteiga");
		c1.exibirItens();
		System.out.println("Valor total: " + c1.calcularValorTotal());
	}

}
