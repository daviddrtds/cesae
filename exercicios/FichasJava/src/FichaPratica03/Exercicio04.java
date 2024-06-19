package FichaPratica03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número:");
        int input1 = input.nextInt();
        int num1 =0;

        while(num1<=input1){
            System.out.println(num1);
            num1++;
        }

    }
}
