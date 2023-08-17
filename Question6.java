package atvd;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        //6. Peça ao usuário que insira o seu ano de nascimento e, em seguida, exiba a sua idade.

        Scanner s = new Scanner(System.in);

        System.out.println("Insira seu ano de nascimento: ");
        int ano = s.nextInt();
        int idade = 2023 - ano;
        System.out.println(idade);
        
    }
}
