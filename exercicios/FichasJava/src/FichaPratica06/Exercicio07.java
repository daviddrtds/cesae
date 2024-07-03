package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Exercicio05.drawSquare;

public class Exercicio07 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o caracter: ");
        String character = input.next();

        System.out.print("Introduza o número de linhas: ");
        int lines = input.nextInt();

        System.out.print("Introduza o número de colunas: ");
        int columns = input.nextInt();


        int[][] newArr = new int[lines][columns];


        drawSquare(character, newArr);



    }

}
