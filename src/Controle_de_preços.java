import static java.lang.IO.*;

void main() {

    int quantidade = Integer.parseInt(readln("Digite a quantidade de preços desejados: "));
    double soma = 0;

    double[] precos = new double[quantidade];
    for (int i = 0; i < precos.length; i++) {
        precos[i] = Double.parseDouble(readln("Digite o " + (i + 1) + "° preço: "));
        soma += precos[i];
    }
    double maior = precos[0];
    double menor = precos[0];
    for (int i = 0; i < precos.length; i++) {
        if (precos[i] > maior) {
            maior = precos[i];
        }
        if (precos[i] < menor) {
            menor = precos[i];
        }
    }
    println("\n===== RESULTADO =====");
    for (int i = 0; i < precos.length; i++) {
        println((i + 1) + "° preço: R$ " + precos[i]);
    }
    println("\nPreço total: R$ " + soma);
    println("Maior preço: R$ " + maior);
    println("Menor preço: R$ " + menor);
}
