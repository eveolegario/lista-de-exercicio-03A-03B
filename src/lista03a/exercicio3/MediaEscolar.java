package lista03a.exercicio3;

import java.util.Scanner;

public class MediaEscolar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira sua primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.println("Insira sua segunda nota: ");
        double nota2 = input.nextDouble();
        input.close();

        double media = (nota1 + nota2) / 2;
        if (media >= 7 &&  media < 10 ) {
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }
    }
}
