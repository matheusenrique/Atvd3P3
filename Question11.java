package atvd;
import java.util.Scanner;

public class Question11 {
    //11. Receba uma string digitada pelo usuário e imprima o seu tamanho (número de caracteres).

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe uma string: ");
        String str =  s.nextLine();
        int caracteres = str.length();
        System.out.println("Essa string possui "+ caracteres + " caracteres");
    }
}
