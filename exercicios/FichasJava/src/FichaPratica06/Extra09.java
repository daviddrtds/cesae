package FichaPratica06;

import java.util.Scanner;

public class Extra09 {

    public static String printMes(int mes) {

        String[] nomeMeses = new String[]{"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        return nomeMeses[mes - 1];
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número entre 1 e 12: ");
        int mes = input.nextInt();

        if (mes > 0 && mes < 13) {
            System.out.println("O mês é " + printMes(mes));
        } else {
            System.out.println("Número inválido");
        }


    }
}
