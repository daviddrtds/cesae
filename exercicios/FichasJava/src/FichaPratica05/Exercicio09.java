package FichaPratica05;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] novaMatrix = new int[3][3];
        int soma = 0;


        for (int i = 0; i < novaMatrix.length; i++) {
            for (int j = 0; j < novaMatrix[0].length; j++) {
                System.out.print("introduza os valores de [" + i + "--" + j + "]: ");
                novaMatrix[i][j] = input.nextInt();
                soma = soma + novaMatrix[i][j];
            }

        }

        for (int i = 0; i < novaMatrix.length; i++) {
            for (int j = 0; j < novaMatrix[0].length; j++) {
                System.out.print(novaMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }


        System.out.println("Soma dos números introduzidos: " + soma);

    }
}
