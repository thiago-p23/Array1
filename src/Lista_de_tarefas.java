import static java.lang.IO.*;
import java.util.ArrayList;

void main() {

    ArrayList<String> tarefas = new ArrayList<>();
    String tarefa;
    
    while (true) {
        tarefa = readln("Digite uma tarefa (digite 'fim' para encerrar): ");
        
        if (tarefa.equals("fim")) {
            break;
        }
        tarefas.add(tarefa);
    }
    println("\n===== LISTA DE TAREFAS =====");
    
    for (int i = 0; i < tarefas.size(); i++) {
        println((i + 1) + " - " + tarefas.get(i));
    }
    println("\nQuantidade de tarefas: " + tarefas.size());
}
