package atvd;
import java.util.Scanner;

public class Question27 {
    //  27. Receba o nome de um produto digitado pelo usuário e concatene-o com o preço do produto,
    // adicionando o símbolo de moeda da sua escolha.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do produto desejado: ");
        String produto = s.nextLine();
        double preco = s.nextDouble();
        System.out.println(produto + " " + preco + " reais");
    }
}
