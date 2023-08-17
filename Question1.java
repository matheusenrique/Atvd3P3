package atvd;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //1. Solicite ao usuário seu nome e imprima uma mensagem de boas-vindas na tela.
        
        System.out.println("Insira seu nome: ");
        String nome = s.nextLine();
        System.out.println("Bem vindo, " + nome + "!");
}
}
