package lista.OperacoesBasicas;

public class Item {
	private String nome;
	private int quantidade;
	private double valor;
	
	
	public Item(String nome, int quantidade, double valor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return nome + " | quantidade = " + quantidade + " | valor = " + valor + "\n";
	}
	
	
	

}
