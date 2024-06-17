package FichaPratica02;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Vamos descobrir o menor destes três números");

        System.out.print("Primeiro número:");
        int num1 = input.nextInt();

        System.out.print("Segundo número:");
        int num2 = input.nextInt();

        System.out.print("Terceiro número:");
        int num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("O número menor é: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O número menor é: " + num2);
        } else {
            System.out.println("O número menor é: " + num3);

        }


    }
}
