package FichaPratica02;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o valor do Salário Anual:");
        double salarioAnual = input.nextDouble();


        if (salarioAnual <= 15000) {
            System.out.println("Paga taxa de 20%: " + salarioAnual * 0.20 + "€");
        }

        if (salarioAnual > 15000 && salarioAnual <= 20000) {
            System.out.println("Paga taxa de 30%: " + salarioAnual * 0.30 + "€");
        }


        if (salarioAnual > 20000 && salarioAnual <= 25000) {
            System.out.println("Paga taxa de 35%: " + salarioAnual * 0.35 + "€");
        }

        if (salarioAnual > 25000) {
            System.out.println("Paga taxa de 40%: " + salarioAnual * 0.40 + "€");
        }


    }
}
