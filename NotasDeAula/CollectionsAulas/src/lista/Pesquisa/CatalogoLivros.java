package lista.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> lista = new ArrayList<>();
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao){
		//Adiciona um livro ao catálogo.
		lista.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		//Pesquisa livros por autor e retorna uma lista com os livros encontrados.
		
		List<Livro> listaAutor = new ArrayList<>();
		//verificar lista vazia;
		if(!lista.isEmpty()) {
			for(Livro l : lista ) {
				if(l.getAutor().equalsIgnoreCase(autor)) listaAutor.add(l);
			}
		} 
		return listaAutor ; 
	}
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		//Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
		List<Livro> listaAnos = new ArrayList<>();
		//verificar lista vazia;
		if(!lista.isEmpty()) {
			for(Livro l : lista ) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) listaAnos.add(l);
			}
		} 
		return listaAnos; 
	}
	public List<Livro> pesquisarPorTitulo(String titulo) {
		//Pesquisa livros por título e retorna o primeiro livro encontrado.

		List<Livro> listaAutor = new ArrayList<>();
		//verificar lista vazia;
		if(!lista.isEmpty()) {
			for(Livro l : lista ) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) listaAutor.add(l);
			}
		} 
		return listaAutor ; 
	}
	
	public static void main(String[] args) {
		CatalogoLivros c1 = new CatalogoLivros();
		c1.adicionarLivro("Rainha Vermelha", "Beatriz", 2020 );
		c1.adicionarLivro("Rainha Rosa", "Beatriz", 2022 );
		c1.adicionarLivro("Rainha Vermelha", "Jurema", 2021 );
		c1.adicionarLivro("Verde ", "Jurema", 2021 );
		System.out.println(c1.pesquisarPorAutor("Jurema"));
		System.out.println(c1.pesquisarPorIntervaloAnos(2019, 2020));
		
	}
}
