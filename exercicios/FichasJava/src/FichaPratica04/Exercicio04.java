package FichaPratica04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        boolean numeroPrimo = true;

        System.out.print("Introduza um valor inteiro para sabermos se é um número primo:");
        int num1 = input.nextInt();


        if (num1 % 2 == 0 && num1 / 1 != num1 && num1 / num1 != 1) {
            numeroPrimo = false;
        }


        if (num1 / 1 == num1 && num1 / num1 == 1) {
            System.out.println("É primo!");
        } else {
            System.out.println("Não é primo.");
        }

    }
}
