package FichaPratica06;

import java.util.Scanner;

public class Extra04 {


    public static void printTabuada(int num1) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " x " + i + " = " + i * num1);
        }

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número para fazermos a tabuada: ");
        int num1 = input.nextInt();

        printTabuada(num1);

    }
}
