package lista01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        System.out.println("Aqui você verá quanto dias, meses e anos você viveu:");
        System.out.println("Digite o seu nome, paizao: ");
        String nome = idade.nextLine();
        System.out.println("É um prazer " + nome + " ! agora diga sua idade: ");
        int ano = idade.nextInt();
        int mes = ano * 30;
        int dias = ano * 365;
        System.out.println(" Bom " + nome + "  você tem " + ano + " anos, viveu um total de  " + mes + "  meses ,  e total de  " + dias + "dias");
    }
}
