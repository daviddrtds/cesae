package FichaPratica03;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número entre 1 e 5:");
        int numInput = input.nextInt();

        int count = 0;


        if (numInput > 5) {
            System.out.println("Número demasiado grande. Tente um número entre 1 e 5");
        } else {
            while (numInput > count) {
                count++;
                System.out.println(count);
            }

        }


    }
}
