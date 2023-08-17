package atvd;
import java.util.Scanner;
public class Question16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      //  16. Peça ao usuário que digite o seu nome e verifique se ele contém mais de 5 caracteres.
      System.out.println("Insira o nome: ");
      String nome = s.nextLine();
      if(nome.length() > 5) {
        System.out.println("Contém mais de 5 caracteres");
      }
      else {
        System.out.println("Menos caracteres");
      }
    }
}
