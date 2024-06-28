package FichaPratica05;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] novoArray = new int[3];
        int anterior = 0;
        int valorMaior = 0;


        for (int i = 0; i < novoArray.length; i++) {
            System.out.print("insira um número inteiro: ");
            novoArray[i] = input.nextInt();

            if (novoArray[i] > anterior) {
                valorMaior = novoArray[i];
                anterior = novoArray[i];
            }

        }

        System.out.println(valorMaior);

    }
}
