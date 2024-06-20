package FichaPratica03;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número:");
        int num1 = input.nextInt();

        int mediaVezes = 0;
        int mediaTotal = num1;


        while (num1 != -1) {
            System.out.print("Introduza um número:");
            num1 = input.nextInt();
            mediaVezes++;
            mediaTotal = mediaTotal + num1;
        }

        mediaTotal++;
        System.out.println("Média: " + mediaTotal / mediaVezes);
        System.out.println("Total: " + mediaTotal);
        System.out.println("Tentativas: " + mediaVezes);

    }
}
