package lista01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner celso = new Scanner(System.in);
        System.out.println("Vamos prosseguir com as temperaturas;");
        System.out.println("AQUI VAMOS CONVERTER E MOSTRAR QUE O FAHRENHEIT ESTÁ EM SUA CIDADE AGORA ");
        System.out.println("Escreva quantos graus Fahrenheit estão na cidada agora: ");
        double fahen = celso.nextDouble();
        double celsog = (fahen - 32.0) * 5.0 / 9.0;
        System.out.println("A temperatura na sua cidade está" + celsog + "  Fahrenheit  ");
    }
}
