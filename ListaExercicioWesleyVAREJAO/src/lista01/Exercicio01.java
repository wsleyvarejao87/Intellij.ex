package lista01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner estoque = new Scanner(System.in);
        double valmax;
        double valmim;
        double situacao;
        System.out.println("Boa tarde, aqui mostrará sua média de chuteiras : ");
        System.out.println("Diga o maximo de chuteiras que voce tem: ");
        valmax = estoque.nextDouble();
        System.out.println("Diga, agora o mínimo  de chuteiras: ");
        valmim = estoque.nextDouble();

        situacao = ((valmim + valmax) /2);
        System.out.println("Otimo paizao,  em breve, mostrará o valor da media de chuteiras :  ");

        System.out.println("A media das camisas é : " + situacao );

    }
}
