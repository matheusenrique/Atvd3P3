package atvd;
import java.util.Scanner;
public class Question33 {
   // 33. Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule e exiba o perímetro do retângulo.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o valor da base e da altura do retângulo.");
        System.out.println("Base: ");
        int base =  s.nextInt();
        System.out.println("Altura: ");
        int altura = s.nextInt();
        int perimetroRet = 2*(base + altura);
        System.out.println("Perímetro do retângulo: "+perimetroRet);
    }
}
