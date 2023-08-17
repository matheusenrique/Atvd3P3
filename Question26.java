package atvd;
import java.util.Scanner;

public class Question26 {
   // 26. Receba um número inteiro e uma string do usuário. Em seguida, concatene-os em uma única string, separando-os com um espaço.
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Insira um número inteiro: ");
    int inteiro =  s.nextInt();
    System.out.println("Insira uma string: ");
    String string = s.nextLine();
    System.out.println(inteiro + string);
   }
}
