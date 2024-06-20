package FichaPratica03;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número (eventualmente introduza -1): ");
        int num1 = input.nextInt();

        int mediaVezes =0;
        int mediaTotal=0;



        while(num1 != -1){
            System.out.println("Introduza um número:");
            num1 = input.nextInt();
            mediaVezes++;
            mediaTotal = mediaTotal + num1;

        }

        System.out.println(mediaTotal/mediaVezes);

    }
}
