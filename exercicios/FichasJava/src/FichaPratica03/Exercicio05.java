package FichaPratica03;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza uma mensagem:");
        String mnsg = input.nextLine();

        System.out.print("Introduza um número:");
        int nVezes = input.nextInt();


        int num1 = 0;

        while (num1 < nVezes) {
            System.out.println(mnsg);
            num1++;
        }

    }
}
