package atvd;
import java.util.Scanner;

public class Question39 {
 //   39. Peça ao usuário que digite uma temperatura em graus Celsius e a converta para Fahrenheit usando
  //  a fórmula: Fahrenheit = (Celsius * 9/5) + 32.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Celsius: ");
        double grausCelsius = s.nextDouble();
        double fahrenheit = (grausCelsius * 9/5) + 32;
        System.out.println("Temperatura em Fahrenheit: "+fahrenheit);        
    }
}
