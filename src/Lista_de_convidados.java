import static java.lang.IO.*;

void main() {

    int quantidade = Integer.parseInt(readln("Digite a quantidade de convidados desejados: "));
    String[] convidados = new String[quantidade];

    // Cadastro
    for (int i = 0; i < convidados.length; i++) {
        convidados[i] = readln("Digite o nome do " + (i + 1) + "° convidado: ");
    }
    println("\n===== LISTA DE CONVIDADOS =====");

    // Exibição
    for (int i = 0; i < convidados.length; i++) {
        println((i + 1) + " - " + convidados[i]);
    }
    println("\nQuantidade total: " + convidados.length);
}