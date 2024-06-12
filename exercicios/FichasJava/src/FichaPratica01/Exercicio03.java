package FichaPratica01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double largura, comprimento, area, perimetro;

        System.out.print("Introduza o valor da largura:");
        largura = input.nextDouble();

        System.out.print("Introduza o valor do comprimento:");
        comprimento = input.nextDouble();

        area = largura * comprimento;
        perimetro = 2 * (largura + comprimento);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

    }
}
