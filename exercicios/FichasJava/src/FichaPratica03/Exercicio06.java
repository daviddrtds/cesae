package FichaPratica03;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o primeiro número:");
        int num1 = input.nextInt();

        System.out.print("Introduza o segundo número:");
        int num2 = input.nextInt();

        while (num1 <= num2){
            System.out.println(num1);
            num1 ++;
        }


    }
}
