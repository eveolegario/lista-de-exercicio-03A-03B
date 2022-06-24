package lista03a.exercicio2;

import java.util.Scanner;

public class MaisBarato {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o preço do primeiro produto: ");
        double produto1 = input.nextDouble();
        System.out.println("Insira o preço do segundo produto: ");
        double produto2 = input.nextDouble();
        System.out.println("Insira o preço do terceiro produto: ");
        double produto3 = input.nextDouble();
        input.close();

        if (produto1 < produto2 && produto1 < produto3){
            System.out.print("Compre o primeiro produto porque é o mais barato");
        }
        else if (produto2 < produto1 && produto2 < produto3) {
            System.out.print("Compre o segundo produto porque é o mais barato");
        }
        else if (produto3 < produto1 && produto3 < produto2) {
            System.out.print("Compre o terceiro produto porque é o mais barato");

        }
    }
}
