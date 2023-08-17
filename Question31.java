package atvd;
import java.util.Scanner;

public class Question31 {
   // 31. Peça ao usuário para digitar a base e a altura de um triângulo. Em seguida, calcule e exiba a área do triângulo.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o valor da base do triângulo: ");
        int base = s.nextInt();
        System.out.println("Informe o valor da altura: ");
        int altura = s.nextInt();
        int areaTriangulo = (base * altura)/2;
        System.out.println("Área do triângulo: "+areaTriangulo);
    }
}
