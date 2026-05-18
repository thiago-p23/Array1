import static java.lang.IO.*;

void main() {

    // Pergunta quantos preços serão digitados
    int quantidade = Integer.parseInt(readln("Digite a quantidade de preços desejados: "));
    double soma = 0;

    // Cria o array com o tamanho informado
    double[] precos = new double[quantidade];

    // Cadastro dos preços
    for (int i = 0; i < precos.length; i++) {
        precos[i] = Double.parseDouble(readln("Digite o " + (i + 1) + "° preço: "));
        soma += precos[i];
    }

    // Define o primeiro preço como base
    double maior = precos[0];
    double menor = precos[0];

    // Verificação do maior e menor preço
    for (int i = 0; i < precos.length; i++) {

        if (precos[i] > maior) {
            maior = precos[i];
        }
        if (precos[i] < menor) {
            menor = precos[i];
        }
    }
    println("\n===== RESULTADO =====");

    // Exibe todos os preços
    for (int i = 0; i < precos.length; i++) {

        println((i + 1) + "° preço: R$ " + precos[i]);
    }

    // Exibe todos, maior e menor
    println("\nPreço total: R$ " + soma);
    println("Maior preço: R$ " + maior);
    println("Menor preço: R$ " + menor);
}