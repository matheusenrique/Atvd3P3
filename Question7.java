package atvd;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
      //7. Peça ao usuário que digite seu primeiro nome e seu sobrenome separadamente. Em seguida,
    //concatene-os em uma única string e exiba o nome completo.
        Scanner s = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome =  s.nextLine();
        System.out.println("Insira seu sobrenome: ");
        String sobreNome = s.nextLine();
        System.out.println("Nome completo: " + nome + " " +sobreNome);

    }
}
