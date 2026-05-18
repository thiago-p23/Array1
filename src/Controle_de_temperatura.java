import static java.lang.IO.*;
import java.util.ArrayList;

void main() {

    ArrayList<Double> celsius = new ArrayList<>();
    ArrayList<Double> fahrenheit = new ArrayList<>();
    String entrada;

    while (true) {
        entrada = readln("Digite a temperatura em Celsius (digite 'sair' para acabar): ");
        if (entrada.equals("sair")) {
            break;
        }
        double tempC = Double.parseDouble(entrada);
        celsius.add(tempC);
        
        double tempF = (tempC * 9/5) + 32;
        fahrenheit.add(tempF);
    }
    double somaC = 0;
    double somaF = 0;

    for (int i = 0; i < celsius.size(); i++) {
        somaC += celsius.get(i);
        somaF += fahrenheit.get(i);
    }
    double mediaC = somaC / celsius.size();
    double mediaF = somaF / fahrenheit.size();

    println("\n===== RESULTADO =====");
    println("\nTemperaturas em Celsius:");
    
    for (int i = 0; i < celsius.size(); i++) {
        println(celsius.get(i) + "°C");
    }
    println("\nTemperaturas em Fahrenheit:");
    
    for (int i = 0; i < fahrenheit.size(); i++) {
        println(fahrenheit.get(i) + "°F");
    }
    println("\nMédia Celsius: " + mediaC + "°C");
    println("Média Fahrenheit: " + mediaF + "°F");
}
