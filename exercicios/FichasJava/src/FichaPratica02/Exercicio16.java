package FichaPratica02;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um valor múltiplo de 5:");
        int valor1 = input.nextInt();

        int nota200, nota100, nota50, nota20, nota10, nota5;

        if (valor1 % 5 == 0) {

            System.out.println("Número de notas necessárias para: " + valor1);

            if (valor1 / 200 >= 1) {   //ver se há notas de 200.
                nota200 = valor1 / 200;   //ver quantas notas de 200 há e guardar em variavel.
                valor1 = valor1 % 200;    //valor introduzido passa a ser o valor que sobra.
                System.out.println("Notas de 200€: " + nota200);   //print quantidade de notas.
            }
            if (valor1 / 100 >= 1) {
                nota100 = valor1 / 100;
                valor1 = valor1 % 100;
                System.out.println("Notas de 100€: " + nota100);
            }
            if (valor1 / 50 >= 1) {
                nota50 = valor1 / 50;
                valor1 = valor1 % 50;
                System.out.println("Notas de 50€: " + nota50);
            }
            if (valor1 / 20 >= 1) {
                nota20 = valor1 / 20;
                valor1 = valor1 % 20;
                System.out.println("Notas de 20€: " + nota20);
            }
            if (valor1 / 10 >= 1) {
                nota10 = valor1 / 10;
                valor1 = valor1 % 10;
                System.out.println("Notas de 10€: " + nota10);
            }
            if (valor1 / 5 >= 1) {
                nota5 = valor1 / 5;
                valor1 = valor1 % 5;
                System.out.println("Notas de 5€: " + nota5);
            }

        } else {
            System.out.println("Valor inválido, introduza um valor múltiplo de 5.");
        }

    }

}

