package atvd;
import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
       // 19. Peça ao usuário que digite a sua cidade e verifique se ela começa com a letra "S" (ou outra letra de sua escolha).
       Scanner s = new Scanner(System.in);
       System.out.println("Insira o nome da sua cidade: ");
       String cidade =  s.nextLine();
       char letra = 'S';
       if(cidade.charAt(0) == letra) {
            System.out.println("Sua cidade começa com a letra S");
       }
       else {
            System.out.println("Sua cidade não começa com a letra S");
       }
       // charAt = usado pra localizar a posição de uma string específica
    }
}
