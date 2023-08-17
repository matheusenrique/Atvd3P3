package atvd;
import java.util.Scanner;
public class Question23 {
    public static void main(String[] args) {
        //23. Solicite ao usuário que digite uma data no formato "dd/mm/aaaa" e extraia o dia, o mês e o ano
        //separadamente, convertendo-os em números inteiros.
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento: ");
        String data = s.nextLine();
        String[] datas = data.split("/");
        int dia = Integer.parseInt(datas[0]);
        int mes = Integer.parseInt(datas[1]);
        int ano = Integer.parseInt(datas[2]);
        System.out.println("Dia:"+ dia + ", Mês: "+ mes+ ", Ano: "+ ano);
        
    }
}
