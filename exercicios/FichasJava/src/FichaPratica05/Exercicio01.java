package FichaPratica05;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        int[] novoArray = new int[10];


        for (int i = 0; i < novoArray.length; i++) {
            System.out.print("Insira um número no index [" + i + "]: ");
            novoArray[i] = input.nextInt();
        }


        for (int i = 0; i < novoArray.length; i++) {
            System.out.println("Index [" + i + "] = " + novoArray[i]);
        }

    }
}
