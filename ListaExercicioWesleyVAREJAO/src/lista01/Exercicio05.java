package lista01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner litro = new Scanner(System.in);
        System.out.println("Aqui mostrará o calculo de quantos litros de gasolina voce gasta em uma viagem");
        System.out.println("uma suporsição, que seu carro gaste 1 Litro de gasolina a cada 12 km");
        System.out.println("Qual foi o tempo que sua viagem durou?");
        double tempo = litro.nextDouble();
        System.out.println("Qual foi a velocidade média...?");
        double velocidade = litro.nextDouble();
        double distancia = tempo * velocidade;
        System.out.println("a distancia que seu carro percorreu foi " + distancia);
        System.out.println("Agora , com os dados que você deu, vamos mostrar quanto você gastou de gasolina");
        double kmlitro = distancia / 12.0;
        System.out.println("Paizao, você gastou " + kmlitro + " de litros de gasolina");
    }
}
