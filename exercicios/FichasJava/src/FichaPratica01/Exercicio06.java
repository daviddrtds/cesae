package FichaPratica01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int temp;
        System.out.println("Introduza o primeiro valor:");
        int valor1 = input.nextInt();
        temp = valor1;
        System.out.println("Introduza o segundo valor:");
        int valor2 = input.nextInt();
        valor1 = valor2;
        valor2 = temp;

        System.out.println("valor 1: " + valor1);
        System.out.println("valor 2: " + valor2);



    }

}
