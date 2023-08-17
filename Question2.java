package atvd;
import java.util.Scanner;

public class Question2 {

   public static void main(String[] args) {

    // 2. Peça ao usuário que digite sua idade em texto (por exemplo, "18") e converta-a em um número inteiro.

    Scanner s = new Scanner(System.in);

    System.out.println("Insira sua idade: ");
    String idade = s.nextLine();
    int numero = Integer.parseInt(idade);
    System.out.println(numero);

   }

}
