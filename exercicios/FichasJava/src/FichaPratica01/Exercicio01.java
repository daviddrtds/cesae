package FichaPratica01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, soma;

        System.out.print("Insira um número maior do que 0: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número maior do que 0: ");
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.println("Total: " + soma);
    }
}
