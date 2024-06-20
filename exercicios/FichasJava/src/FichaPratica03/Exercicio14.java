package FichaPratica03;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir?");
        int max = input.nextInt();
        int novo;

        int count = 1;

        while (count <= max) {
            System.out.print("Introduza um número:");
            novo = input.nextInt();
            count++;
        }


    }
}
