package atvd;
import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // 14. Peça ao usuário que insira dois números e exiba o maior deles.
       System.out.println("Insira dois números: ");
       int num1 = s.nextInt();
       int num2 = s.nextInt();
       if (num1 > num2) {
        System.out.println("Número 1 é maior");
       }
       else if (num2 > num1) {
        System.out.println("Número 2 é maior");
       }
       else {
        System.out.println("São iguais.");
       }
    }
}
