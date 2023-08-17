package atvd;
import java.util.Scanner;
public class Question17 {
    public static void main(String[] args) {
       // 17. Solicite ao usuário que insira o seu estado civil e exiba uma mensagem apropriada (por exemplo:"Você é casado(a)", "Você é solteiro(a)", etc.).
    Scanner s = new Scanner(System.in);
        System.out.println("Insira seu estado civil: ");
        String estadoCivil = s.nextLine();
        System.out.println("Você é " + estadoCivil);


}

}
