package FichaPratica05;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] novoArray = new int[3];
        int maiorPar;


        for (int i = 0; i < novoArray.length; i++) {
            System.out.print("insira um número inteiro no index [" + i + "]:");
            novoArray[i] = input.nextInt();
        }

        maiorPar = novoArray[0];

        for (int i = 0; i < novoArray.length; i++) {
            if (novoArray[i] % 2 == 0) {
                    maiorPar = novoArray[i];
            }
        }


        if (maiorPar % 2 != 0) {
            System.out.println("Não inseriu valor par");
        } else {
            System.out.println("Maior valor par inserido: " + maiorPar);
        }


    }
}
