package FichaPratica01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double prod1, prod2, prod3, total, desconto, finalTotal;

        System.out.print("Valor do primeiro produto:");
        prod1 = input.nextDouble();

        System.out.print("Valor do segundo produto:");
        prod2 = input.nextDouble();

        System.out.print("Valor do terceiro produto:");
        prod3 = input.nextDouble();

        total = prod1 + prod2 + prod3;
        desconto = total * 0.1;
        finalTotal = total - desconto;

        System.out.println("Total: " + total);
        System.out.println("Desconto de 10%: " + desconto);
        System.out.println("Preço Final: " + finalTotal);

    }
}
