package FichaPratica06;

import java.util.Scanner;

public class Exercicio02 {


    public static int userValue(int valor) {

        Scanner input = new Scanner(System.in);

        while (valor <= 0) {
            System.out.print("Introduza número inteiro e positivo: ");
            valor = input.nextInt();
        }
        return valor;
    }


    public static void imprimeEstrelas(int num) {

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Introduza número inteiro e positivo: ");
        int valor = input.nextInt();

        userValue(valor);
        imprimeEstrelas(valor);

    }
}
