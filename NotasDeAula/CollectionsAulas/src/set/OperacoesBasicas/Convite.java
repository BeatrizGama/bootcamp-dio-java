package set.OperacoesBasicas;

public class Convite {
	
	private String nome;
	private int id;
	
	public Convite(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Convite [nome=" + nome + ", id=" + id + "]";
	}
	
	

}
