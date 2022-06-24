package lista03a.exercicio1;

import java.util.Scanner;

public class Maioral {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        double numero1 = input.nextDouble();
        System.out.println("Insira o segundo número: ");
        double numero2 = input.nextDouble();
        input.close();

        if (numero1 > numero2) {
            System.out.println("O primeiro número digitado é maior que o segundo");
        }
        if (numero2 > numero1) {
            System.out.println("O segundo número digitado é maior que o primeiro");
        }
    }
}
