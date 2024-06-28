package FichaPratica05;

import java.util.Scanner;

public class Exercicio05 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] novoArray = new int[10];

        double soma = 0;
        double count = 0;
        double media;


        for (int i = 0; i < novoArray.length; i++) {

            System.out.print("insira um número inteiro: ");
            novoArray[i] = input.nextInt();
            soma = soma + novoArray[i];
            count++;
        }

        media = soma / count;

        System.out.println("A média dos números introduzidos é de: " + media);


    }
}
