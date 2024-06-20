package FichaPratica03;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número entre 1 e 5:");
        int numInput = input.nextInt();

        int count = 1;
        int total = 1;


        if (numInput > 12 || numInput < 0) {
            System.out.println("Tente um número entre 1 e 12");
        } else {
            while (numInput > count) {
                total = total * numInput;
                numInput--;
            }
            System.out.println(total);

        }


    }
}
