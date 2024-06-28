package FichaPratica05;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] novoArray = new int[5];
        int valorMaior = 0;


        for (int i = 0; i < novoArray.length; i++) {
            System.out.print("insira um número inteiro: ");
            novoArray[i] = input.nextInt();
        }

        valorMaior = novoArray[0];

        for (int i = 0; i < novoArray.length; i++) {
            if (novoArray[i] > valorMaior) {
                valorMaior = novoArray[i];
            }
        }


        System.out.println("Valor maior inserido: " + valorMaior);

    }
}
