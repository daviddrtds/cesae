package FichaPratica05;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matrixOne = new int[2][2];
        int add = 0;

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[0].length; j++) {
                System.out.print("Introduza um número para a posição [" + i + "--" + j + "]: ");
                matrixOne[i][j] = input.nextInt();

                if(i == j){
                    add = add + matrixOne[i][j];
                }
            }
        }

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[0].length; j++) {
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Soma dos números na diagonal: " + add);


    }
}
