package FichaPratica05;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] novaMatrix = new int[3][3];
        int menor = 0;
        int maior = 0;

        for (int i = 0; i < novaMatrix.length; i++) {
            for (int j = 0; j < novaMatrix[0].length; j++) {
                System.out.print("introduza os valores de [" + i + "--" + j + "]: ");
                novaMatrix[i][j] = input.nextInt();

                maior = novaMatrix[0][0];
                menor = novaMatrix[0][0];

                if (novaMatrix[i][j] > maior) {
                    maior = novaMatrix[i][j];
                } else if (novaMatrix[i][j] < menor) {
                    menor = novaMatrix[i][j];
                }
            }
        }

        for (int i = 0; i < novaMatrix.length; i++) {
            for (int j = 0; j < novaMatrix[0].length; j++) {
                System.out.print(novaMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("O valor menor na matriz é " + menor);
        System.out.println("O valor maior na matriz é " + maior);
    }
}
