package FichaPratica02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o valor do Salário Anual:");
        double salarioAnual = input.nextDouble();

        if (salarioAnual <= 15000) {
            System.out.println("Paga taxa de 20%: " + salarioAnual * 0.20 + "€");
        } else {
            System.out.println("Paga taxa de 30%: " + salarioAnual * 0.30 + "€");
        }

    }
}
