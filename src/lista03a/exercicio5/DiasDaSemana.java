package lista03a.exercicio5;

import java.util.Scanner;

public class DiasDaSemana {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para saber o dia correspondente na semana: ");
        String opcao = input.next();
        input.close();

        if (opcao.equalsIgnoreCase("1")) {
            System.out.println("Sua opção foi Domingo");
        } else if (opcao.equalsIgnoreCase("2")) {
            System.out.println("Sua opção foi Segunda");
        } else if (opcao.equalsIgnoreCase("3")) {
            System.out.println("Sua opção foi Terça");
        } else if (opcao.equalsIgnoreCase("4")) {
            System.out.println("Sua opção foi Quarta");
        } else if (opcao.equalsIgnoreCase("5")) {
            System.out.println("Sua opção foi Quinta");
        } else if (opcao.equalsIgnoreCase("6")) {
            System.out.println("Sua opção foi Sexta");
        } else if (opcao.equalsIgnoreCase("7")) {
            System.out.println("Sua opção foi Sábado");
        } else {
            System.out.println("Opção inválida, tente novamente");
        }
    }
}
