package FichaPratica04;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){

            System.out.print("Introduza o primeiro número:");
            double num1 = input.nextDouble();

            System.out.print("Introduza o segundo número:");
            double num2 = input.nextDouble();

            System.out.print("Introduza a operação a realizar (+, -, * ou /):");
            String operacao = input.next();

            switch (operacao){

                case "+":
                    System.out.println("Soma de " + num1 + "+" + num2 + ": " + (num1 + num2));
                    break;

                case "-":
                    System.out.println("Subtração de " + num1 + "-" + num2 + ": " + (num1 - num2));
                    break;


                case "*":
                    System.out.println("multiplicação de " + num1 + "x" + num2 + ": " + (num1 * num2));
                    break;

                case "/":
                    System.out.println("Divisão de " + num1 + "/" + num2 + ": " + (num1 / num2));
                    break;

                default:
                    System.out.println("Caracter incorreto, introduza +, -, * ou /");
            }

            System.out.print("Deseja continuar? (s/n)");
            String pergunta = input.next();

            switch (pergunta){
                case "s": continuar = true;
                break;
                case "n": continuar = false;
                break;
                default:
                    System.out.println("Caracter incorreto, introduza s ou n");
                    continuar = false;
            }

        }








    }
}
