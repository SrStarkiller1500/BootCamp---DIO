import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListDataEvent;

public class ListaTarefa {
   
    //Atributo
    private List <Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa (String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa (String descricao){
        List<Tarefa> tarefasPararemover= new ArrayList<>();
        for(Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasPararemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasPararemover);
        }
    
    
    public int obterNumetoTotaldeTarefas(){
        return tarefaList.size();
    }
    
    
    public void obterDescricoesdeTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa listaTarefa= new ListaTarefa();
        System.out.println("O Número de Elementos totais na lista é: " + listaTarefa.obterNumetoTotaldeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O Número de Elementos totais na lista é: " + listaTarefa.obterNumetoTotaldeTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O Número de Elementos totais na lista é: " + listaTarefa.obterNumetoTotaldeTarefas());

        listaTarefa.obterDescricoesdeTarefas();
    }
}