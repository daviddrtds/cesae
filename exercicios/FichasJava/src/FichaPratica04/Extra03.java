package FichaPratica04;

import java.util.Scanner;

public class Extra03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int multi;

        System.out.print("Introduza um número de 1 a 10 para fazermos a tabuada:");
        int numInput = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            multi = numInput * i;
            System.out.println(numInput + " x " + i + " = " + multi);
        }
    }
}
