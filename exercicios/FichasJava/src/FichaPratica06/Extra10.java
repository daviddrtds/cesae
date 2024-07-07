package FichaPratica06;

import java.util.Scanner;

public class Extra10 {


    public static double areaQuad(double lado) {
        return lado * lado;
    }

    public static double areaRet(double comp, double larg) {
        return comp * larg;
    }

    public static double areaCirc(double raio) {
        return 3.14 * (raio * raio);
    }

    public static double areaTri(double base, double altura) {
        return (base * altura) / 2;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        



       // do{

            System.out.println("******* Programa de cálculo de preço imobiliário *******");
            System.out.println("Escolha a forma do seu terreno: ");
            System.out.println("1. Quadrado");
            System.out.println("2. Retângulo");
            System.out.println("3. Círculo");
            System.out.println("4. Triângulo");
            System.out.println("0. Sair");
            int userInput = input.nextInt();





       // }while(userInput !=0);



    }
}
