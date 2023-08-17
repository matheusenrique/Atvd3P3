package atvd;
import java.util.Scanner;
public class Question34 {
  //  34. Solicite ao usuário que insira três números decimais. Em seguida, calcule e exiba a média aritmética desses números.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira três números decimais: ");
        double numDec1 = s.nextDouble();
        double numDec2 = s.nextDouble();
        double numDec3 =  s.nextDouble();
        double mediaAritmetica = (numDec1 + numDec2 + numDec3)/3;
        System.out.println("Média aritimética: "+ mediaAritmetica);
    }
}
