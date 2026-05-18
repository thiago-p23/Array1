import static java.lang.IO.*;
import java.util.ArrayList;

void main() {

    // Cria uma lista dinâmica para armazenar as tarefas
    ArrayList<String> tarefas = new ArrayList<>();
    String tarefa;

    // Cadastro das tarefas
    while (true) {
        tarefa = readln("Digite uma tarefa (digite 'fim' para encerrar): ");

        // Verifica se o usuário digitou "fim"
        if (tarefa.equals("fim")) {
            break;
        }

        // Adiciona a tarefa na lista
        tarefas.add(tarefa);
    }
    println("\n===== LISTA DE TAREFAS =====");

    // Exibe todas as tarefas cadastradas
    for (int i = 0; i < tarefas.size(); i++) {
        println((i + 1) + " - " + tarefas.get(i));
    }

    // Mostra quantidade de tarefas
    println("\nQuantidade de tarefas: " + tarefas.size());
}