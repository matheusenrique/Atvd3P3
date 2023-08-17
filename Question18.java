package atvd;
import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {
     //   18. Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule a sua área e exiba o resultado.
        Scanner s = new Scanner(System.in);
        System.out.println("Insira o valor da base do retângulo: ");
        int base = s.nextInt();
        System.out.println("Insira o valor da altura: ");
        int altura = s.nextInt();
        int retangulo = base * altura;
        System.out.println("Área do retângulo: " + retangulo);
    }
}
