package FichaPratica05;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] novoArray = new int[10];
        int anterior = 0;
        int valorMenor = 0;


        for (int i = 0; i < novoArray.length; i++) {

            System.out.print("insira um número inteiro: ");
            novoArray[i] = input.nextInt();

            if (novoArray[i] < anterior) {
                valorMenor = novoArray[i];
            }
            anterior = novoArray[i];
        }


        System.out.println("Valor menor inserido: " + valorMenor);

    }
}
