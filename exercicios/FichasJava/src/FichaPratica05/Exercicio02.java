package FichaPratica05;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String[] nomeMeses = new String[]{"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};


        int[] comissoes = new int[12];
        int total = 0;


        for (int i = 0; i < comissoes.length; i++) {
            System.out.print("Introduza o valor para a comissão de " + nomeMeses[i] + ":");
            comissoes[i] = input.nextInt();
            total = total + comissoes[i];
        }

        System.out.println("Total anual de comissões: " + total + "€");

    }
}
