package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Exercicio05.somarMatrizes;
import static FichaPratica06.Exercicio05.somatorioMatrizes;

public class Exercicio08 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        int[][] oneMatrix = new int[2][2];
        int[][] twoMatrix = new int[2][2];

        int soma;

        for (int i = 0; i < oneMatrix.length; i++) {
            for (int j = 0; j < oneMatrix[0].length; j++) {
                System.out.print("Introduza um número para a Matriz1 index [" + i + "--" + j + "]: ");
                oneMatrix[i][j] = input.nextInt();
            }
        }


        for (int i = 0; i < twoMatrix.length; i++) {
            for (int j = 0; j < twoMatrix[0].length; j++) {
                System.out.print("Introduza um número para a Matriz2 index [" + i + "--" + j + "]: ");
                twoMatrix[i][j] = input.nextInt();
            }
        }



        soma = somatorioMatrizes(oneMatrix, twoMatrix);
        System.out.println("Total da soma das duas matrizes: " + soma);
        somarMatrizes(oneMatrix, twoMatrix);




    }

}
