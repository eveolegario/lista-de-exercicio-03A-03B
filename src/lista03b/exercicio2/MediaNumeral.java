package lista03b.exercicio2;

import java.util.Scanner;

public class MediaNumeral {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira a quantidade de números para calcular a média: ");
        int quantidadeNumeros = input.nextInt();
        if (quantidadeNumeros <= 0) {
            System.out.println("Escolha um número de maior valor");
        } else {
            int soma = 0;
            for (int i = 1; i <= quantidadeNumeros; i++) {
                System.out.println("Digite o " + i + "º número:");
                int numero = input.nextInt();
                if (numero <= 0) {
                    System.out.println("Escolha um número de maior valor para refazer a média");
                    break;
                } else {
                    soma += numero;
                }
                double media = (double) soma / (double) quantidadeNumeros;
                System.out.println("A média é: " + media);
            }
            input.close();
        }
    }
}
