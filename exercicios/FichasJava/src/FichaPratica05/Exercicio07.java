package FichaPratica05;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] novoArray = new int[10];

        int anterior = 0;
        int atualMaior = 0;


        for (int i = 0; i < novoArray.length; i++) {

            System.out.print("insira um número inteiro: ");
            novoArray[i] = input.nextInt();

            if (novoArray[i] > anterior && novoArray[i] % 2 == 0) {
                atualMaior = novoArray[i];
                anterior = novoArray[i];
            }
        }


        if (atualMaior > 0) {
            System.out.println("Maior valor par inserido: " + atualMaior);
        } else {
            System.out.println("Nenhum valor par inserido");
        }


    }
}
