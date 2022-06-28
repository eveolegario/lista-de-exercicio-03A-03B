package lista03b.exercicio4;

import java.util.Scanner;

public class NumerosPositivos {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Insira a quantidade de números para soma: ");
            int quantidadeNumeros = input.nextInt();
            int soma = 0;
            for (int i = 1; i <= quantidadeNumeros; i++) {
                System.out.println("Digite o " + i + "º número: ");
                int numero = input.nextInt();
                if (numero <= 0) {
                    System.out.println("Escolha um número positivo e de maior valor");
                    break;
                } else {
                    soma += numero;
                }
            }
            input.close();
            System.out.println("A soma é: " + soma);
        }
    }

