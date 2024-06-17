package FichaPratica02;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o valor do saldo médio anual da sua conta:");
        double mediaSalario = input.nextDouble();


        if (mediaSalario >= 0 && mediaSalario <= 2000) {
            System.out.println("Crédito não disponível para o valor do saldo anual.");
        }
        if (mediaSalario > 2000 && mediaSalario <= 4000) {
            System.out.println("Para o valor anual médio de " + mediaSalario + "€, tem disponível um crédito de " + mediaSalario * 0.20 + "€");
        }
        if (mediaSalario > 4000 && mediaSalario <= 6000) {
            System.out.println("Para o valor anual médio de " + mediaSalario + "€, tem disponível um crédito de " + mediaSalario * 0.30 + "€");
        }
        if (mediaSalario > 6000) {
            System.out.println("Para o valor anual médio de " + mediaSalario + "€, tem disponível um crédito de " + mediaSalario * 0.40 + "€");
        }
        if (mediaSalario < 0) {
            System.out.println("Erro, valor médio inferior a 0");
        }


    }
}
