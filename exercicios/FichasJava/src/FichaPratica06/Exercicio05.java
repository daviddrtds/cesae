package FichaPratica06;

public class Exercicio05 {


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


}
