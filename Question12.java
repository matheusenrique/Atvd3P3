package atvd;
import java.util.Scanner;
public class Question12 {
    //12. Solicite ao usuário um número inteiro e exiba se ele é par ou ímpar.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println("Par");
        }
        else{
            System.out.println("Ímpar");
        }
    }
}
