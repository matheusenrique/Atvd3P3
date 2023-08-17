package atvd;
import java.util.Scanner;

public class Question29 {
  //  29. Receba uma string contendo um endereço de e-mail e concatene-a com uma mensagem de
   // agradecimento personalizada.
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe seu e-mail: ");
        String email = s.nextLine();
        System.out.println(email + "(Seu e-mail foi cadastrado.)");
   }
}
