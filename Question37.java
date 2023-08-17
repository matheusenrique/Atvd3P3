package atvd;
import java.util.Scanner;
public class Question37 {
   // 37. Solicite ao usuário para digitar um número decimal e arredonde-o para o inteiro mais próximo.
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número decimal: ");
        double numDec = s.nextDouble();
        System.out.println("Valor arredondado: " + Math.round(numDec)+ ", "+Math.floor(numDec));
        //Math.round =  arredonda para o valor mais alto
        //Math.floor = arredonda para o valor mais baixo
        
   }
}
