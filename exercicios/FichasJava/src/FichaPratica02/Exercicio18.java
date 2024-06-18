package FichaPratica02;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.print("Introduza o código de colaborador:");
        int codigoFunc = input.nextInt();

        System.out.print("Introduza o Cargo do Colaborador: (E) Empregado, (C) Chefe ou (A) Administrador:");
        String cargoFunc = input.next();

        System.out.print("Introduza o total de dias trabalhados no mês:");
        int diasMes = input.nextInt();


        double valorBruto = 0;
        double subAlim = 0;
        double valorIRS = 0;
        double valorSS = 0;
        double valorSSEmpresa = 0;


        if (diasMes > 0) {

            switch (cargoFunc) {
                case "E":
                    valorBruto = diasMes * 40;
                    valorSS = valorBruto * 0.11;
                    valorSSEmpresa = valorBruto * 0.2375;
                    subAlim = diasMes * 5;
                    break;
                case "C":
                    valorBruto = diasMes * 60;
                    valorSS = valorBruto * 0.11;
                    valorSSEmpresa = valorBruto * 0.2375;
                    subAlim = diasMes * 7.5;
                    break;
                case "A":
                    valorBruto = diasMes * 80;
                    valorSS = valorBruto * 0.09;
                    valorSSEmpresa = valorBruto * 0.21;
                    subAlim = diasMes * 7.5;
                    break;
            }

            if (valorBruto > 1000) {
                valorIRS = valorBruto * 0.20;
            } else {
                valorIRS = valorBruto * 0.10;
            }


            System.out.println("Informações do Colaborador código " + codigoFunc + " para " + diasMes + " dias trabalhados.");
            System.out.println("a. Salário Bruto Mensal: " + valorBruto + "€");
            System.out.println("b. Subsídio de alimentação: " + subAlim + "€");
            System.out.println("c. Valor IRS: -" + valorIRS + "€");
            System.out.println("d. Valor SS: -" + valorSS + "€");
            System.out.println("d. Valor SS Entidade Patronal: -" + valorSSEmpresa + "€");
            System.out.println("e. Valor Líquido: " + (valorBruto + subAlim - valorSS - valorIRS) + "€");


        } else {
            System.out.println("Valor inválido, introduza um número de dias maior do que 0");
        }


    }
}
