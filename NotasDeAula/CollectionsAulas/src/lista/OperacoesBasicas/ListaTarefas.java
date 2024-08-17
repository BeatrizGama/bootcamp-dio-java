package lista.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	private List<Tarefa> tarefaList;

	public ListaTarefas() {
		// criando uma lista vazia
		this.tarefaList = new ArrayList<>();
	}
	
	//  Adiciona uma nova tarefa à lista com a descrição fornecida.
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	// Remove uma tarefa da lista com base em sua descrição.
	public void removerTarefa(String descricao){
		List<Tarefa> tarefasRemover = new ArrayList<>();
		for( Tarefa t : tarefaList) {
			if ( t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasRemover.add(t);
			}			
		}
		// remove tudo que estiver em tarefasRemover
		tarefaList.removeAll(tarefasRemover);
		
	}
	
	//Retorna o número total de tarefas na lista.
	public int obterNumeroTotalTarefas(){
		return tarefaList.size();
	}
	
	//Retorna uma lista contendo a descrição de todas as tarefas na lista.
	public void obterDescricoesTarefas(){
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefas lista = new ListaTarefas();
		lista.adicionarTarefa("Tarefa 1");
		lista.adicionarTarefa("Tarefa 1");
		lista.adicionarTarefa("Tarefa 2");
		System.out.println("Número de tarefas " + lista.obterNumeroTotalTarefas());
		lista.obterDescricoesTarefas();
		lista.removerTarefa("Tarefa 1");
		System.out.println("Número de tarefas " + lista.obterNumeroTotalTarefas());
		
	}

}
