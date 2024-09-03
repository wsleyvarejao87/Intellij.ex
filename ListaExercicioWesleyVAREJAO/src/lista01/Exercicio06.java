package lista01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner celso = new Scanner(System.in);
        System.out.println("Aqui vamos mostrar os celsos e fahrenheit");
        System.out.println("Digite quantos garus celsos está fazendo agora no seu estado: ");
        double celsos = celso.nextDouble();
        double farenh = (9.0 * celsos + 160.0) / 5.0;
        System.out.println("O seu estado está fazendo" + farenh + "graus fahrenheit");
    }
}
