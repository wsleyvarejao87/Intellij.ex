package lista01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner dolar = new Scanner(System.in);
        double dolete = 5.62;
        System.out.println("Vamos ver a cotação do Dolar em real");
        System.out.println("Olá, aqui vamos lhe mostrar a cotação atual do Dolar :");
        System.out.println("A cotação atual do Dolar :" + dolete);
        System.out.println("--- Escreva quanto você no pix paizao: ---");
        double leiadoleta = dolar.nextDouble();
        double converting = leiadoleta * dolete;
        System.out.println("Seu valor após a conversão é R$" + converting);
    }
}

