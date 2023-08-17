package atvd;
import java.util.Scanner;
public class Question28 {
   // 28. Receba um número inteiro do usuário e concatene-o com uma mensagem, informando o dobro
   // desse número.
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Digite um número inteiro: ");
    int numInt = s.nextInt();
    int numDobro =  numInt * 2;
    System.out.println("Valor inteiro: " + numInt +", " + "Valor dobrado: " + numDobro);
   }
}
