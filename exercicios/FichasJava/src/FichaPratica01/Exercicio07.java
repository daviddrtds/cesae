package FichaPratica01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Valor do primeiro produto:");
        double prod1 = input.nextInt();

        System.out.println("Valor do segundo produto:");
        double prod2 = input.nextInt();

        System.out.println("Valor do terceiro produto:");
        double prod3 = input.nextInt();

        double total = (prod1 + prod2 + prod3);
        double desconto = total * 0.1;
        double finalTotal = total - desconto;

        System.out.println("Total: " + total);
        System.out.println("Desconto de 10%: " + desconto);
        System.out.println("Preço Final: " + finalTotal);

    }
}
