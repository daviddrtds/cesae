package FichaPratica04;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Jogador 1 - Introduza um número entre 0 e 100:");
        int num1 = input.nextInt();

        int count = 0;

        System.out.print("Jogador 2 - Tente adivinhar o número do Jogador 1:");
        int num2 = input.nextInt();


        do {

            if (num2 < num1) {
                System.out.print("O seu número é mais baixo! Tente novamente:");
                num2 = input.nextInt();
            }
            if (num2 > num1) {
                System.out.print("o seu número é mais alto! Tente novamente:");
                num2 = input.nextInt();
            }
            count++;


        } while (num2 != num1);

        System.out.println("Acertou no número! Foram precisas " + count + " tentativas.");


    }
}
