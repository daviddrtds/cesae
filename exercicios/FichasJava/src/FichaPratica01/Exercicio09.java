package FichaPratica01;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o código de colaborador:");
        int codigoFunc = input.nextInt();
        System.out.print("Introduza o total de dias trabalhados no mês:");
        int totalDias = input.nextInt();

        int valorBruto = 40 * totalDias;
        int subAlim = 5 * totalDias;
        double valorIrs = valorBruto * 0.10;
        double valorSSFunc = valorBruto * 0.11;
        double totalSSEmpr = valorBruto * 0.2375;
        double totalSalario = (valorBruto - valorIrs - valorSSFunc) + subAlim;

        System.out.println("a. Salário Bruto: " + valorBruto + "€");
        System.out.println("b. Subsídio de alimentação: +" + subAlim + "€");
        System.out.println("c. Encargos Irs 10%: -" + valorIrs + "€");
        System.out.println("c. Encargos SS 11%: -" + valorSSFunc + "€");
        System.out.println("c. Encargos SS empresa 23.75%: " + totalSSEmpr + "€");
        System.out.println("d. Salário Líquido: " + totalSalario);
    }
}
