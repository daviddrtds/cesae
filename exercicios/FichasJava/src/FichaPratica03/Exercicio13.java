package FichaPratica03;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o primeiro número:");
        int inicio = input.nextInt();

        System.out.print("Introduza o segundo número:");
        int fim = input.nextInt();


        while (inicio <= fim) {

            if (inicio % 5 == 0) {
                System.out.println(inicio);
            }
            inicio++;

        }


    }
}
