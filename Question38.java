package atvd;
import java.util.Scanner;
public class Question38 {
 //   38. Receba três números inteiros digitados pelo usuário e exiba o resultado da operação (n1 + n2) *n3.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite três números inteiros: ");
        int n1= s.nextInt();
        int n2= s.nextInt();
        int n3 = s.nextInt();
        int operacao = (n1+n2)*n3;
        System.out.println("Resultado: "+ operacao);
    }
} 
