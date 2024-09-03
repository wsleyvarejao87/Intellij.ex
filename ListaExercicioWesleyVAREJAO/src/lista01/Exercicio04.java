package lista01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        System.out.println("Digite o número 001: ");
        int numin1 = calculo.nextInt();
        System.out.println("Digite o número 002: ");
        int numin2 = calculo.nextInt();
        System.out.println("Digite o número 003: ");
        int numin3 = calculo.nextInt();
        System.out.println("Digite o número 004: ");
        int numin4 = calculo.nextInt();
        int calcsoma1 = numin1 + numin2;
        int var10000 = numin1 + numin3;
        var10000 = numin1 + numin4;
        var10000 = numin2 + numin3;
        var10000 = numin2 + numin4;
        var10000 = numin3 + numin4;
        int calcmulti1 = numin1 * numin2;
        var10000 = numin1 * numin3;
        var10000 = numin1 * numin4;
        var10000 = numin2 * numin3;
        var10000 = numin2 * numin4;
        var10000 = numin3 * numin4;
        System.out.println("o resultado das somas e multiplicações dos valores escolhidos são: ");
        System.out.println("O resultado da primeira soma é: " + calcsoma1 + "e da multiplicação é:  " + calcmulti1);
    }
}
