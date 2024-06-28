package FichaPratica05;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] novoArray = new int[3];
        int parMaior;


        for (int i = 0; i < novoArray.length; i++) {
            System.out.print("insira um número inteiro no index [" + i + "]:");
            novoArray[i] = input.nextInt();
        }

        parMaior = novoArray[0];

        for (int i = 0; i < novoArray.length; i++) {
            if (novoArray[i] % 2 == 0) {


            }
        }


    }
}
