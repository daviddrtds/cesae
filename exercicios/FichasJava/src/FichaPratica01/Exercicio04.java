package FichaPratica01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14;
        double raio, area;

        System.out.print("Introduza o valor do raio da circunferência: ");
        raio = input.nextDouble();
        area = PI * raio * raio;
        System.out.println("Área da Circunferência: " + area);

    }
}
