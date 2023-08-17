package atvd;
import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
       // 22. Receba uma string contendo um número inteiro e some 10 a esse número, convertendo-o novamente para uma string antes de exibi-lo.
        Scanner s = new Scanner(System.in);
       System.out.println("Insira uma String: ");
        String string = s.nextLine();
        int numInt = Integer.parseInt(string);
        System.out.println("Valor inteiro: " + numInt + 10);
        String str = String.valueOf(numInt + 10);
        System.out.println("Valor em String: " + str);

    }
}
