package FichaPratica06;

import java.util.Scanner;

public class Extra06 {


    public static double somatorio(int num) {

        int soma = 0;

        while (num > 0) {
            soma = soma + num % 10;
            num = num / 10;
        }
        return soma;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número: ");
        int num1 = input.nextInt();

        System.out.println("A soma dos números de " + num1 + " é " + somatorio(num1));


    }
}
