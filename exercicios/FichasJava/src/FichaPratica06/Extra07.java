package FichaPratica06;

import java.util.Scanner;

public class Extra07 {


    public static int inverterNum(int num) {

        int inv = 0;

        while (num > 0) {
            inv = inv * 10;
            inv = inv + num % 10;
            num /= 10;
        }

        return inv;

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número: ");
        int num1 = input.nextInt();

        System.out.println("O número invertido de " + num1 + " é " + inverterNum(num1));

    }
}
