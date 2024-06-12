package FichaPratica02;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Vamos verificar se um número é par ou ímpar!");
        System.out.println("Introduza um número:");
        int num1 = input.nextInt();

        if (num1 % 2 == 0){
            System.out.println("O número que escolheu é par!");
        }else{
            System.out.println("O número que escolheu é ímpar!");
        }


    }
}
