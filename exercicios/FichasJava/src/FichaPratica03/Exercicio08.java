package FichaPratica03;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número:");
        int num1 = input.nextInt();

        int numAntes = num1 - 5;
        int numDepois = num1 + 5;

        while (numAntes <= numDepois) {
            if (numAntes != num1) {
                System.out.println(numAntes);
            }
            numAntes++;
        }


//        while (num1 > numAntes) {
//            System.out.println(numAntes);
//            numAntes++;
//        }
//
//
//        while (num1 < numDepois) {
//            num1++;
//            System.out.println(num1);
//        }

    }
}
