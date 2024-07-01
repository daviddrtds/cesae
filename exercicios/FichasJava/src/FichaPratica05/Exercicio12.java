package FichaPratica05;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arrayOne = new int[10];
        int[] arrayTwo = new int[10];
        int[][] matrixOne = new int[10][2];


        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print("Introduza um número no Array 1 no index [" + i + "]:");
            arrayOne[i] = input.nextInt();
        }

        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print("Introduza um número no Array 2 no index [" + i + "]:");
            arrayTwo[i] = input.nextInt();
        }

        for (int i = 0; i < matrixOne.length; i++) {
            matrixOne[i][0] = arrayOne[i];
            matrixOne[i][1] = arrayTwo[i];
        }

//        for (int i = 0; i < matrixOne.length; i++) {
//            for (int j = 0; j < matrixOne[0].length; j++) {
//                if (j == 0) {
//                    matrixOne[i][j] = arrayOne[i];
//                }
//                if (j == 1) {
//                    matrixOne[i][j] = arrayTwo[i];
//                }
//            }
//        }

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[0].length; j++) {
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
    }
}
