package lista01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
            Scanner venda = new Scanner(System.in);
            double comissao = 0.05;
            double product1 = 5000.0;
            double product2 = 4000.0;
            double product3 = 13000.0;
            System.out.println("Olá Irmão, aqui mostrará a comissão no número e tipo produtos que você vendeu");
            System.out.println("||");
            System.out.println("||");
            System.out.println("Para começar, diga o seu nome?: ");
            String nome = venda.nextLine();
            System.out.println("Então seu nome é  " + nome + " Digite a quantidade de produtos de código 001 1que você vendeu: ");
            double procuctQtd1 = venda.nextDouble();
            System.out.println("Digite a quantidade de produto de código 002 que você vendeu:");
            double procuctQtd2 = venda.nextDouble();
            System.out.println("Digite a quantidade de produto de código 003 que você vendeu:");
            double procuctQtd3 = venda.nextDouble();
            double salario = (procuctQtd1 * product1 + procuctQtd2 * product2 + procuctQtd3 * product3) * comissao;
            System.out.println(nome + ", a sua comissão de acordo com o número de vendas ficará:  " + salario);
        }
    }
