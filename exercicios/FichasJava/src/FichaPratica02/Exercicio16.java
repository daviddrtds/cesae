package FichaPratica02;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.print("Introduza um valor múltiplo de 5:");
        int valor1 = input.nextInt();

        int nota200;
        int nota100;


        if (valor1 % 5 == 0) {

            if (valor1 / 200 >= 1) {
                nota200 = valor1 / 200;
                valor1 = valor1 % 200;

            }
            if (valor1 / 100 >= 1) {
                nota100 = valor1 / 100;

            }
        }
        else {
            System.out.println("Valor inválido, introduza um valor múltiplo de 5.");
        }

    }

}

