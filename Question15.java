package atvd;
import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      //  15. Receba a altura e o peso de uma pessoa digitados pelo usuário. Em seguida, calcule o seu índice de
      //  massa corporal (IMC) utilizando a fórmula: IMC = peso / (altura * altura) e exiba o resultado.

      System.out.println("Insira sua altura: ");
      double altura = s.nextDouble();
      System.out.println("Insira seu peso: ");
      double peso = s.nextDouble();
      double massaCorporal = peso / (altura * altura);
      System.out.println(massaCorporal);

    }
}
