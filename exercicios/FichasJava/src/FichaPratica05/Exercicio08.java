package FichaPratica05;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        int[][] novaMatrix = new int[3][3];


        for (int i = 0; i < novaMatrix.length; i++) {
            for (int j = 0; j < novaMatrix[0].length; j++) {
                System.out.print("introduza os valores de [" + i + "--" + j + "]: ");
                novaMatrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < novaMatrix.length; i++) {
            for (int j = 0; j < novaMatrix[0].length; j++) {
                System.out.print(novaMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }


    }

}
