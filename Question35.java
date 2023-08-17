package atvd;
import java.util.Scanner;
public class Question35 {
   // 35. Peça ao usuário para digitar a sua idade e, em seguida, informe quantos meses e quantos dias ele já
   // viveu (considerando um ano com 365 dias).
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Informe sua idade: ");
            int idade = s.nextInt();
            int meses = 12 * idade;
            int dias = 365 * idade; 
            System.out.println("Você já viveu "+ meses +" meses e "+ dias + " dias.");
    }
}
