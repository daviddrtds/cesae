package FichaPratica06;

import java.util.Scanner;

public class Extra02 {


    public static double media(int num1, int num2, int num3) {

        double media = (num1 + num2 + num3) / 3;
        return media;

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Introduza o segundo número: ");
        int num2 = input.nextInt();

        System.out.print("Introduza o terceiro número: ");
        int num3 = input.nextInt();

        double media = media(num1, num2, num3);


        System.out.println("A média dos números introduzidos é: " + media);

    }
}
