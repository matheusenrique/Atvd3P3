package atvd;
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
       // 21. Solicite ao usuário um número decimal e converta-o em um número inteiro.
       Scanner s = new Scanner(System.in);
       System.out.println("Insira um número decimal: ");
       double numDec = s.nextDouble();
       int valor = (int)numDec;
       System.out.println("Valor inteiro: " + valor);
    }
}
