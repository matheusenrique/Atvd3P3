package atvd;
import java.util.Scanner;

public class Question20 {
   // 20. Solicite ao usuário que insira dois números decimais e calcule o resto da divisão entre eles.
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Insira dois números decimais: ");
    double numDec1= s.nextDouble();
    double numDec2 = s.nextDouble();
    double resto = numDec1 % numDec2;
    System.out.printf("Resto da divisão: " + resto);
   }
}
