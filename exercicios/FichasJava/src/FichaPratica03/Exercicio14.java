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

        System.out.print("Introduza um número:");
        anterior = input.nextInt();


        while (count < max) {
            System.out.print("Introduza um número:");
            novo = input.nextInt();

            if(anterior<=novo){
                // Deixou de ser crescente
            }

            anterior=novo;

            count++;
        }




    }
}
