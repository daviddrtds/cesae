package FichaPratica03;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir?");
        int max = input.nextInt();
        int novo;
        int anterior;

        int count = 1;
        boolean crescente = true;

        System.out.print("Introduza um número:");
        anterior = input.nextInt();


        while (count < max) {
            System.out.print("Introduza um número:");
            novo = input.nextInt();

            if (anterior >= novo) {
                crescente = false;
            }

            anterior = novo;

            count++;
        }

        if (crescente) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não Crescente");
        }


    }
}
