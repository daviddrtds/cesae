package FichaPratica01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int valor1, valor2;
        System.out.print("Introduza o primeiro valor:");
        valor1 = input.nextInt();

        System.out.print("Introduza o segundo valor:");
        valor2 = input.nextInt();

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.println("valor 1: " + valor1);
        System.out.println("valor 2: " + valor2);


    }

}
