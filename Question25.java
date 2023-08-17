package atvd;
import java.util.Scanner;
public class Question25 {
   // 25. Solicite ao usuário que insira seu ano de nascimento e concatene-o com uma mensagem de
   // boas-vindas, como "Bem-vindo ao nosso programa, nascido em [ano de nascimento]!".
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira o seu ano de nascimento: ");
        String nascimento = s.nextLine();
        System.out.println("Bem-vindo ao nosso programa, nascido em "+nascimento);
    }
}
