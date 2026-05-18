import static java.lang.IO.*;
import java.util.ArrayList;

void main() {

    // Lista das temperaturas em Celsius
    ArrayList<Double> celsius = new ArrayList<>();
    // Lista das temperaturas em Fahrenheit
    ArrayList<Double> fahrenheit = new ArrayList<>();
    String entrada;

    // Cadastro das temperaturas
    while (true) {
        entrada = readln("Digite a temperatura em Celsius (digite 'sair' para acabar): ");

        // Encerra o programa
        if (entrada.equals("sair")) {
            break;
        }

        // Converte texto para número
        double tempC = Double.parseDouble(entrada);
        celsius.add(tempC);

        // Conversão para Fahrenheit
        double tempF = (tempC * 9/5) + 32;
        fahrenheit.add(tempF);
    }

    double somaC = 0;
    double somaF = 0;

    // Soma das temperaturas
    for (int i = 0; i < celsius.size(); i++) {

        somaC += celsius.get(i);
        somaF += fahrenheit.get(i);
    }

    // Cálculo das médias
    double mediaC = somaC / celsius.size();
    double mediaF = somaF / fahrenheit.size();

    println("\n===== RESULTADO =====");

    // Exibe temperaturas em Celsius
    println("\nTemperaturas em Celsius:");
    for (int i = 0; i < celsius.size(); i++) {

        println(celsius.get(i) + "°C");
    }

    // Exibe temperaturas em Fahrenheit
    println("\nTemperaturas em Fahrenheit:");
    for (int i = 0; i < fahrenheit.size(); i++) {

        println(fahrenheit.get(i) + "°F");
    }

    // Exibe médias
    println("\nMédia Celsius: " + mediaC + "°C");
    println("Média Fahrenheit: " + mediaF + "°F");
}