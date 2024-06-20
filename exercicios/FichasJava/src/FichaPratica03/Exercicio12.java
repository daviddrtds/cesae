package FichaPratica03;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número. Para terminar introduza um número negativo:");
        int inputNum = input.nextInt();

        int count0025 = 0;
        int count2650 = 0;
        int count5175 = 0;
        int count76100 = 0;


        while (inputNum >= 0) {

            if (inputNum > 0 && inputNum <= 25) {
                count0025++;
            }
            if (inputNum > 25 && inputNum <= 50) {
                count2650++;
            }
            if (inputNum > 50 && inputNum <= 75) {
                count5175++;
            }
            if (inputNum > 75 && inputNum <= 100) {
                count76100++;
            }
            System.out.print("Introduza outro número:");
            inputNum = input.nextInt();
        }


        System.out.println("Entre 0 e 25 introduziu: " + count0025 + " números.");
        System.out.println("Entre 26 e 50 introduziu: " + count2650 + " números.");
        System.out.println("Entre 51 e 75 introduziu: " + count5175 + " números.");
        System.out.println("Entre 76 e 100 introduziu: " + count76100 + " números.");

    }

}


