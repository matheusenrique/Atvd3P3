package atvd;
import java.util.Scanner;

public class Question24 {
    //  24. Receba o nome de uma cidade do usuário e concatene-o com o nome do estado para formar uma
    //mensagem completa, como "Você mora em [cidade], [estado].".
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira o nome da sua cidade: ");
        String cidade =  s.nextLine();
        System.out.println("Digite seu estado: ");
        String estado = s.nextLine();
        System.out.println("Você mora em " + cidade + ", "+ estado);
    }
}
