package atvd;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //4. Peça ao usuário para digitar dois números inteiros e exiba a soma deles.
        
        System.out.println("Digite dois valores inteiros: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int soma = num1 + num2;
        System.out.println("Soma: " + soma);
    }
}
