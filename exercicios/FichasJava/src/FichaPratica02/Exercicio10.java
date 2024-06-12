package FichaPratica02;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro número:");
        double num1 = input.nextDouble();

        System.out.print("Segundo número:");
        double num2 = input.nextDouble();

        System.out.println("Que operação aritmética deseja efetuar? (+, -, * ou /)");
        String userInput = input.next();

        switch (userInput) {

            case "+":
                System.out.println("Resultado da soma:" + (num1 + num2));
                break;

            case "-":
                System.out.println("Resultado da subtração:" + (num1 - num2));
                break;

            case "*":
                System.out.println("Resultado da multiplicação:" + (num1 * num2));
                break;

            case "/":
                System.out.println("Resultado da divisão:" + (num1 / num2));
                break;

            default:
                System.out.println("Erro, caracter inválido, utilize +, -, * ou /");
        }

    }
}
