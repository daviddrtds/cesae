package FichaPratica02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insíra o primeiro número:");
        int num1 = input.nextInt();

        System.out.print("Insíra o segundo número:");
        int num2 = input.nextInt();


        if (num1 == num2) {
            System.out.println("Os números são iguais!");
        } else {
            if (num1 > num2) {
                System.out.println("Maior: " + num1);
            } else {
                System.out.println("Maior: " + num2);
            }
        }

    }
}
