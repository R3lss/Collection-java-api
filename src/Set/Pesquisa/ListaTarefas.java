package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        if(tarefaSet.contains(descricao)){
            tarefaSet.remove(descricao);
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contaTarefas(){
        int total = 0;
        for (Tarefa t : tarefaSet){
            total += 1;
        }
        return total;
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConluidas = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if(t.isTarefaConcluida()){
                tarefasConluidas.add(t);
            }
        }
        return tarefasConluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if(!t.isTarefaConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        Tarefa tarefaConcluida = null;
        for(Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(true);
                tarefaConcluida = t;
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for (Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(false);
                tarefaPendente = t;
                break;
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }
}
