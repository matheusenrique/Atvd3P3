package atvd;
import java.util.Scanner;;

public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //5. Receba um número decimal do usuário e calcule o seu quadrado.
        System.out.println("Insira o valor: ");
        float numDecimal = s.nextFloat();
        System.out.println("Valor ao quadrado: " + Math.pow(numDecimal, 2));
    }
}
