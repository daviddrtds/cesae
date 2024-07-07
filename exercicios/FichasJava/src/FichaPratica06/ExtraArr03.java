package FichaPratica06;

import java.util.Scanner;

public class ExtraArr03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr1 = new int[5];
        boolean hasNumber = false;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Introduza um número no index [" + i + "]: ");
            arr1[i] = input.nextInt();
        }

        System.out.print("Pesquise um número no array: ");
        int num1 = input.nextInt();

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == num1) {
                hasNumber = true;
                break;
            }
        }

        if (hasNumber) {
            System.out.println(num1 + " existe no array! :)");
        } else {
            System.out.println(num1 + " não existe no array :(");
        }

    }
}
