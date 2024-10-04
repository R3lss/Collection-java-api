package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionaTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); //cria uma lista vazia para colocar as tarefas que tem que remover
        for(Tarefa t : tarefaList){ // intera na tarefaList vendo quando que bate com a descrição colocada
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
            tarefaList.removeAll(tarefasParaRemover);
        }
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elemento na lista é "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionaTarefa("Tarefa 1");
        System.out.println("O número total de elemento na lista é "+ listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
