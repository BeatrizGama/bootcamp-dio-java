package lista.Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas {
	private List<Pessoa> lista = new ArrayList<>();
	
	public void adicionarPessoa(String nome, int idade , double altura) {
		lista.add(new Pessoa (nome, idade , altura));
	}
	
	public List<Pessoa> compararIdade(){
		List<Pessoa> listaOrdenada = new ArrayList<>(lista);
		Collections.sort(listaOrdenada);
		return listaOrdenada;
		
	}
	
	public List<Pessoa> compararAltura(){
		List<Pessoa> listaOrdenada = new ArrayList<>(lista);
		Collections.sort(listaOrdenada , new ComparatorPorAltura());
		return listaOrdenada;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoas lista = new OrdenacaoPessoas();
		lista.adicionarPessoa("beatriz", 19, 1.60);
		lista.adicionarPessoa("joao", 20, 1.90);
		lista.adicionarPessoa("thiago", 16, 1.70);
		lista.adicionarPessoa("tania", 60, 1.50);
		System.out.println(lista.compararIdade());
		System.out.println(lista.compararAltura());
	}
}
