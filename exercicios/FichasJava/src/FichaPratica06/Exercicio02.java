package FichaPratica06;

import java.util.Scanner;

public class Exercicio02 {


    public static int userValue() {

        Scanner input = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Introduza número inteiro e positivo: ");
            valor = input.nextInt();
        } while (valor <= 0);

        return valor;
    }


    public static void imprimeEstrelas(int num) {

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }


    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        // System.out.print("Introduza número inteiro e positivo: ");
        //int valor = input.nextInt();
        // userValue(valor);
        imprimeEstrelas(userValue());

    }
}
