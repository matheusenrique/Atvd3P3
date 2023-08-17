package atvd;
import java.util.Scanner;
public class Question13 {
    //13. Receba um número inteiro digitado pelo usuário e verifique se ele é positivo ou negativo.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int valor = s.nextInt();
        if(valor > 0){
            System.out.println("Positivo");
        }
        else if(valor < 0){
            System.out.println("Negativo");
        }
        else {
            System.out.println("0");
        }
    }
}
