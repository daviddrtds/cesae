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
}
