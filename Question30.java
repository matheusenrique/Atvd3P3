package atvd;
import java.util.Scanner;
public class Question30 {
   // 30. Receba dois números inteiros do usuário e exiba a soma, a diferença, o produto e o quociente
   // (divisão inteira) entre eles.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira dois números inteiros: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int soma = num1 + num2;
        int diferenca = num1 - num2;
        int produto = num1 * num2;
        double divisao = num1/num2;
        System.out.println("Soma: "+soma + ", Diferença: "+diferenca+", Produto: "+produto+", Divisão: "+divisao);
    }
}
