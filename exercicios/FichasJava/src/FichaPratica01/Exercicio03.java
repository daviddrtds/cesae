package FichaPratica01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double largura, comprimento;

        System.out.println("Introduza o valor da largura:");
        largura = input.nextInt();

        System.out.println("Introduza o valor do comprimento:");
        comprimento = input.nextInt();

        double area = largura * comprimento;
        double perimetro = 2 * (largura + comprimento);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

    }
}
