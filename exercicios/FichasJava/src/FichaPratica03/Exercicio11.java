package FichaPratica03;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número limite:");
        int limite = input.nextInt();

        System.out.print("Introduza um número incremento:");
        int salto = input.nextInt();

        int count = 0;


        if (limite > 0 && salto > 0) {
            while (count <= limite) {
                System.out.println(count);
                count = count + salto;
            }
        } else {
            System.out.println("Erro, introduza valores maiores de 0");
        }


    }

}
