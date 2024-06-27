package FichaPratica04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean numeroPrimo = true;

        System.out.print("Introduza um valor inteiro para sabermos se é um número primo:");
        int num1 = input.nextInt();


        for (int i = 2; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                numeroPrimo = false;
                break;
            }
        }


        if(numeroPrimo){
            System.out.println("É número primo");
        }else{
            System.out.println("Não é número primo.");
        }

    }
}
