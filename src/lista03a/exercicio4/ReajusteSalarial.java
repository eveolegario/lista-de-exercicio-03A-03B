package lista03a.exercicio4;

import java.util.Scanner;

public class ReajusteSalarial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira o valor do seu salário atual: ");
        double salario = input.nextDouble();
        input.close();

        double vintePorCentoDeAumento = salario * 0.20;
        double maisVintePorcento = vintePorCentoDeAumento + salario;
        double quinzePorCentoDeAumento = salario * 0.15;
        double maisQuinzePorCento = quinzePorCentoDeAumento + salario;
        double dezPorCentoDeAumento = salario * 0.1;
        double maisDezPorCento = dezPorCentoDeAumento + salario;
        double cincoPorCentoDeAumento = salario * 0.05;
        double maisCincoPorCento = cincoPorCentoDeAumento + salario;

        if (salario <= 280){
            System.out.printf("Salário antes do reajuste: R$ %.2f\n", salario);
            System.out.println("Percentual de aumento aplicado: 20%");
            System.out.printf("Valor do aumento: R$ %.2f\n", vintePorCentoDeAumento);
            System.out.printf("Salário após o aumento: R$ %.2f\n", maisVintePorcento);
        } else if (salario >= 280 && salario <= 700){
            System.out.printf("Salário antes do reajuste: R$ %.2f\n", salario);
            System.out.println("Percentual de aumento aplicado: 15%");
            System.out.printf("Valor do aumento: R$ %.2f\n", quinzePorCentoDeAumento);
            System.out.printf("Salário após o aumento: R$ %.2f\n", maisQuinzePorCento);
        } else if (salario >= 700 && salario <= 1500){
            System.out.printf("Salário antes do reajuste: R$ %.2f\n", salario);
            System.out.println("Percentual de aumento aplicado: 10%");
            System.out.printf("Valor do aumento: R$ %.2f\n",dezPorCentoDeAumento);
            System.out.printf("Salário após o aumento: R$ %.2f\n", maisDezPorCento);
        } else if (salario >= 1500){
            System.out.printf("Salário antes do reajuste: R$ %.2f\n", salario);
            System.out.println("Percentual de aumento aplicado: 5%");
            System.out.printf("Valor do aumento: R$ %.2f\n",maisCincoPorCento);
            System.out.printf("Salário após o aumento: R$ %.2f\n",maisCincoPorCento);
        }
    }
}
