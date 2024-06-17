package FichaPratica02;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Saldo atual da conta bancária:");
        double saldo = input.nextDouble();

        System.out.print("Montante a movimentar:");
        double movimento = input.nextDouble();

        double total = saldo + movimento;

        if (total < 0) {
            System.out.println("Operação Inválida, saldo insuficiente.");
        } else {
            saldo= total;
            System.out.println("Saldo atual: " + saldo);
        }

    }
}
