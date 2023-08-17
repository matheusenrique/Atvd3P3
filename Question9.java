package atvd;
import java.util.Scanner;


public class Question9 {
    public static void main(String[] args) {
      //  9. Receba o nome de um animal digitado pelo usuário e exiba uma mensagem informando qual animal foi digitado.
      Scanner s = new Scanner(System.in);
      System.out.println("Digite o nome do animal: ");
      String animal = s.nextLine();
      System.out.println(animal);

    }
}
