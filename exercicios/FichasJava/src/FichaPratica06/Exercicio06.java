package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Exercicio05.*;

public class Exercicio06 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int arraySize;

        do {
            System.out.print("Insira un número maior do que 0 para definir o tamanho do array: ");
            arraySize = input.nextInt();

        } while (arraySize <= 0);


        int[] newArr = new int[arraySize];

        for (int i = 0; i < newArr.length; i++) {
            System.out.print("Introduza o número para o index [" + i + "]: ");
            newArr[i] = input.nextInt();
        }

        int opcaoMenu;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("7. Ver o maior número do array");
            System.out.println("8. Ver o menor número do array");
            System.out.println("9. Ver se o array é crescente");
            System.out.println("0. Sair");
            opcaoMenu = input.nextInt();

            switch (opcaoMenu) {
                case 7:
                    System.out.println("O maior número do array é " + maiorArr(newArr));
                    break;

                case 8:
                    System.out.println("O menor número do array é " + menorArr(newArr));
                    break;

                case 9:
                    System.out.println("O array é crescente? " + isCrescentArr(newArr));
                    break;

                case 0:
                    System.out.println("Adeuzinho");
                    break;

                default:
                    System.out.println("Opção de menu inválida");
                    break;
            }


        } while (opcaoMenu != 0);


    }

}
