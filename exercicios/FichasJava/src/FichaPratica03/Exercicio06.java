package FichaPratica03;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o primeiro número:");
        int numInicio = input.nextInt();

        System.out.print("Introduza o segundo número:");
        int numFim = input.nextInt();

        while (numInicio <= numFim){
            System.out.println(numInicio);
            numInicio ++;
        }


    }
}
