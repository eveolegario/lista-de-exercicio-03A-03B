package lista03b.exercicio9;

import java.util.Scanner;

public class CalculadoraFatorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número para se calcular o fatorial: ");
        int respostaUsuario;
        int fatorial = 1;
        respostaUsuario = input.nextInt();
        if (respostaUsuario >= 0) {
            for (int i = 1; i <= respostaUsuario; i++) {
                fatorial = fatorial * i;
            }
            System.out.println("O valor fatorial de " + respostaUsuario + " é: " + fatorial);
        }   if (respostaUsuario <= 0) {
            System.out.println("Inválido, escolha outro número a partir de 0! ");
        }
    }
}
