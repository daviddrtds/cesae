package FichaPratica06;

import java.util.Scanner;

public class ExtraArr04 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] arr1 = new int[5];
        boolean hasNumber = false;
        int counter = 0;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Introduza um número no index [" + i + "]: ");
            arr1[i] = input.nextInt();
        }

        System.out.print("Pesquise um número no array: ");
        int num1 = input.nextInt();

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == num1) {
                hasNumber = true;
                counter++;
            }
        }
        int[] indexes = new int[counter];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == num1) {
                indexes[i] = i;
            }
        }


        if (hasNumber) {
            System.out.println(num1 + " existe no array! :)");

            for (int i = 0; i < indexes.length; i++) {
                System.out.println(num1 + "existe no index [" + indexes[i] + "]");
            }

        } else {
            System.out.println(num1 + " não existe no array :(");
        }


    }
}
