package lista01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner circunfe = new Scanner(System.in);
        double pi = 3.14159;
        System.out.println("Aqui vamos dar uma ajudada em quem tem dificuldade em matematica");
        System.out.println("Ele vai calcular o volume da circufenrência");
        System.out.println("Digite o raio da circufenrência:");
        double raio = circunfe.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = circunfe.nextDouble();
        double volume = pi * raio * raio * altura;
        System.out.println("o volume da circufenrência será: " + volume);
    }
}
