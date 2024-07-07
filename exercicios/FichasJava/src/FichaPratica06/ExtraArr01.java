package FichaPratica06;

import java.util.Scanner;

public class ExtraArr01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr1 = new int[13];


        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Introduza um número no index [" + i + "]: ");
            arr1[i] = input.nextInt();
        }


        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
