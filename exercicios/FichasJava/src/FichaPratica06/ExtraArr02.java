package FichaPratica06;

import java.util.Scanner;

public class ExtraArr02 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] arr1 = new int[5];


        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Introduza um número no index [" + i + "]: ");
            arr1[i] = input.nextInt();
        }


        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.println(arr1[i]);
        }

    }
}
