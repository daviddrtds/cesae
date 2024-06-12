package FichaPratica01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Introduza o primeiro valor:");
        num1 = input.nextInt();

        System.out.println("Introduza o segundo valor:");
        num2 = input.nextInt();

        System.out.println("Introduza o terceiro valor:");
        num3 = input.nextInt();

        double media = (num1 + num2 + num3) / 3;
        double medPond = (num1 * 0.2) + (num2 * 0.3) + (num3*0.5);

        System.out.println("Média dos valores: " + media);
        System.out.println("Média Ponderada: " + medPond);


    }
}
