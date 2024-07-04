package FichaPratica06;

import java.util.Scanner;

public class extra01 {


    public static int numeroMaisPequeno(int num1, int num2, int num3) {

        if (num1 < num2 && num1 < num3) {
            return num1;
        }
        if (num2 < num1 && num2 < num3) {
            return num2;
        }
        return num3;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Introduza o segundo número: ");
        int num2 = input.nextInt();

        System.out.print("Introduza o terceiro número: ");
        int num3 = input.nextInt();

        int isSmall = numeroMaisPequeno(num1, num2, num3);
        System.out.println("O número mais pequeno é: " + isSmall);
    }

}
