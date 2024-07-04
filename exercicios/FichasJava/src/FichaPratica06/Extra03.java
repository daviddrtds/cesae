package FichaPratica06;

import java.util.Scanner;

public class Extra03 {


    public static double areaRet(double largura, double comprimento) {
        return largura * comprimento;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza a largura do retângulo: ");
        double larg = input.nextDouble();

        System.out.print("Introduza o comprimento do retângulo: ");
        double comp = input.nextDouble();

        double area = areaRet(larg, comp);

        System.out.println("A área do retângulo é de: " + area);

    }
}
