package FichaPratica05;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] novoArray = new int[3];
        int parMaior;
        boolean encontrouPar = false;  //  = (novoArray[0]%2==0) tira o if do par do index0


        for (int i = 0; i < novoArray.length; i++) {
            System.out.print("insira um número inteiro no index [" + i + "]:");
            novoArray[i] = input.nextInt();
        }


        parMaior = novoArray[0];


        if (parMaior % 2 == 0) {    // verifica logo se index 0 é par
            encontrouPar = true;
        }


        for (int i = 0; i < novoArray.length; i++) {
            if (novoArray[i] % 2 == 0) {

                if (novoArray[i] > parMaior || !encontrouPar) {
                    parMaior = novoArray[i];
                    encontrouPar = true;
                }
            }
        }


        if (encontrouPar) {
            System.out.println("O maior número par inserido é: " + parMaior);
        } else {
            System.out.println("Nenhum número par inserido");
        }


    }
}
