package atvd;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //3. Receba um número inteiro do usuário e converta-o em um número decimal (float).

        int inteiro = s.nextInt();
        System.out.println("Valor inteiro: " + inteiro);
        float decimal = (float)inteiro;
        System.out.println("Valor decimal: " + decimal);        

    }
}
