package FichaPratica05;

import java.util.Scanner;

public class Exercicio05 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double[] novoArray = new double[10];

        double soma = 0;
        double media;


        for (int i = 0; i < novoArray.length; i++) {

            System.out.print("insira um número inteiro no index [" + i + "]:");
            novoArray[i] = input.nextDouble();
            soma = soma + novoArray[i];
        }

        media = soma / novoArray.length;

        System.out.println("A soma dos números introduzidos é de: " + soma);
        System.out.println("O tamanho do array é de: " + novoArray.length);
        System.out.println("A média dos números introduzidos é de: " + media);


    }
}
