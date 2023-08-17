package atvd;
import java.util.Scanner;
public class Question32 {
   // 32. Receba o raio de uma circunferência digitado pelo usuário e calcule o seu perímetro (2 * π * raio).
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do raio da circunferência: ");
        int raio = s.nextInt();
        double perimetro = (2 * 3.14 * raio);
        System.out.println(perimetro);
    }
}
