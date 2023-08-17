package atvd;
import java.util.Scanner;
public class Question36 {
  //  36. Receba um valor em reais e a cotação do dólar digitados pelo usuário. Em seguida, converta o valor
   // para dólares e exiba o resultado.
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um valor em reais: ");
        double reais = s.nextDouble();
        System.out.println("Cotação do dólar: ");
        double dolar = s.nextDouble();
        double conversao = reais/dolar;
        System.out.println("Valor convertido: "+ conversao);
   }
}
