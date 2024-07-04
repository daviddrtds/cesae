package FichaPratica06;

public class Exercicio05 {


    /**
     * @param arr
     * @return
     */

    public static int maiorArr(int[] arr) {

        int maior = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maior) {
                maior = arr[i];
            }
        }
        return maior;
    }


    public static int menorArr(int[] arr) {

        int menor = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
            }
        }
        return menor;
    }


    public static boolean isCrescentArr(int[] arr) {

        int anterior = arr[0];
        boolean crescente = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < anterior) {
                crescente = false;
                break;
            }
        }
        return crescente;
    }


    public static void drawSquare(String letter, int[][] arrOne) {

        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrOne[0].length; j++) {

                if (i == 0 || i == arrOne.length - 1 || j == 0 || j == arrOne[0].length - 1) {
                    System.out.print(letter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void somarMatrizes(int[][] oneMatrix, int[][] twoMatrix) {

        int[][] threeMatrix = new int[oneMatrix.length][oneMatrix[0].length];

        for(int i = 0; i<threeMatrix.length;i++){
            for(int j = 0; j<threeMatrix[0].length;j++){
                threeMatrix[i][j] = oneMatrix[i][j] + twoMatrix[i][j];
                System.out.print(threeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int somatorioMatrizes(int[][] oneMatrix, int[][] twoMatrix) {

        int total = 0;

        for (int i = 0; i < oneMatrix.length; i++) {
            for (int j = 0; j < oneMatrix[0].length; j++) {
                total = total + oneMatrix[i][j];
            }
        }

        for (int i = 0; i < twoMatrix.length; i++) {
            for (int j = 0; j < twoMatrix[0].length; j++) {
                total = total + twoMatrix[i][j];
            }
        }

        return total;

    }


}
