package atvd;
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // 8. Solicite ao usuário uma sequência de números separados por espaço e exiba quantos números foram digitados.
        System.out.println("Insira os números separados por espaços: ");
        String sequenciaNum = s.nextLine();
        String[] numeros = sequenciaNum.split(" ");
        int nums = numeros.length;
        System.out.println("Número de espaços: "+ nums);
        

    }
}
