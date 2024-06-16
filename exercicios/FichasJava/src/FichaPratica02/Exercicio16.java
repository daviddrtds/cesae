package FichaPratica02;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Introduza um valor múltiplo de 5. Exemplo: 5, 10, 15, 20, 25 etc.");
        int valor1 = input.nextInt();


        if (valor1 % 5 == 0) {



        } else {
            System.out.println("Valor inválido, introduza um valor múltiplo de 5.");
        }

    }
}
