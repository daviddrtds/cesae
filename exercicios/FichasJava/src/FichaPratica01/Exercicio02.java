package FichaPratica01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, soma, sub, multi, divisao;

        System.out.println("Introduza um número:");
        num1 = input.nextInt();

        System.out.println("Introduza um número:");
        num2 = input.nextInt();

        soma = num1 + num2;
        sub = num1 - num2;
        multi = num1 * num2;
        divisao = num1 / num2;

        System.out.println("Soma:" + soma);
        System.out.println("Subtração:" + sub);
        System.out.println("Multiplicação:" + multi);
        System.out.println("Divisão:" + divisao);


    }
}


