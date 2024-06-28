package FichaPratica05;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[][] novaMatrix = new int[3][3];
        int numeroPesquisa;
        int count = 0;


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


        System.out.print("Que número deseja pesquisar na matriz? ");
        numeroPesquisa = input.nextInt();

        for (int i = 0; i < novaMatrix.length; i++) {
            for (int j = 0; j < novaMatrix[0].length; j++) {
                if (novaMatrix[i][j] == numeroPesquisa) {
                    count++;
                }
            }
        }

        System.out.println("Existem " + count + " posições na matriz com o número " + numeroPesquisa + ".");

    }
}
