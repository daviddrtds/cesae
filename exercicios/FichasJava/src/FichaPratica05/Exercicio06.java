package FichaPratica05;

import java.util.Scanner;

public class Exercicio06 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] novoArray = new int[3];

        int anterior = 0;
        int atualMaior = 0;
        boolean crescente = true;


        for (int i = 0; i < novoArray.length; i++) {

            System.out.print("insira um número inteiro: ");
            novoArray[i] = input.nextInt();
            crescente = false;
            if (novoArray[i] > anterior) {
                atualMaior = novoArray[i];
                anterior = novoArray[i];
                crescente = true;
            }


        }

        if (crescente) {
            System.out.println("Os números estão por ordem crescente.");
        } else{
            System.out.println("Os números NÃO estão por ordem crescente.");
        }

    }
}
