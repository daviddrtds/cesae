package FichaPratica02;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Introduza três números que iremos colocar por ordem crescente ou decrescente");

        System.out.print("Introduza o primeiro número:");
        double num1 = input.nextDouble();

        System.out.print("Introduza o segundo número:");
        double num2 = input.nextDouble();

        System.out.print("Introduza o terceiro número:");
        double num3 = input.nextDouble();

        System.out.print("Ordem crescente(c) ou decrescente(d)?");
        String ordem = input.next();

        switch (ordem) {
            case "c":
                if (num1 < num2 && num1 < num3) {
                    if (num2 < num3) {
                        System.out.println(num1 + " - " + num2 + " - " + num3);

                    } else {
                        System.out.print(num1 + " - " + num3 + " - " + num2);

                    }
                }
                if (num2 < num1 && num2 < num3) {
                    if (num1 < num3) {
                        System.out.print(num2 + " - " + num1 + " - " + num3);

                    } else {
                        System.out.print(num2 + " - " + num3 + " - " + num1);

                    }
                }
                if (num3 < num1 && num3 < num2) {
                    if (num1 < num2) {
                        System.out.print(num3 + " - " + num1 + " - " + num2);

                    } else {
                        System.out.print(num3 + " - " + num2 + " - " + num1);

                    }
                }
                break;


            case "d":
                if (num1 > num2 && num1 > num3) {
                    if (num2 > num3) {
                        System.out.println(num1 + " - " + num2 + " - " + num3);

                    } else {
                        System.out.print(num1 + " - " + num3 + " - " + num2);

                    }
                }
                if (num2 > num1 && num2 > num3) {
                    if (num1 > num3) {
                        System.out.print(num2 + " - " + num1 + " - " + num3);

                    } else {
                        System.out.print(num2 + " - " + num3 + " - " + num1);

                    }
                }
                if (num3 > num1 && num3 > num2) {
                    if (num1 > num2) {
                        System.out.print(num3 + " - " + num1 + " - " + num2);

                    } else {
                        System.out.print(num3 + " - " + num2 + " - " + num1);

                    }
                }
                break;

            default:
                System.out.println("Valor inválido, utilize 'c' para crescente ou 'd' para decrescente");
                break;
        }


    }
}
