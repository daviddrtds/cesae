package FichaPratica03;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número:");
        int inputNum = input.nextInt();

        int count = 2;

        while (count <= inputNum) {

            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }




    }
}
