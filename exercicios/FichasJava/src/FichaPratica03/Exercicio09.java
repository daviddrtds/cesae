package FichaPratica03;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número:");
        int num1 = input.nextInt();

        int contador = 0;
        int total = num1;


        while (num1 != -1) {
            System.out.print("Introduza um número:");
            num1 = input.nextInt();
            total = total + num1;
            contador++;
        }

        total++;

        System.out.println("Média: " + total / contador);
        System.out.println("Total: " + total);
        System.out.println("Tentativas: " + contador);

    }
}
