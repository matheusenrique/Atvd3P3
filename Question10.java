package atvd;
import java.util.Scanner;
public class Question10 {
    //10. Peça ao usuário que digite o seu nome e o seu sobrenome. Em seguida, exiba o nome completo invertido (sobrenome, nome).
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     
    System.out.println("Insira seu nome: ");
        String nome =  s.nextLine();
        System.out.println("Insira seu sobrenome: ");
        String sobreNome = s.nextLine();
        System.out.println("Nome invertido: " + sobreNome + " " + nome);
   }

}
