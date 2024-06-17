package FichaPratica02;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o valor das horas:");
        int inputHoras = input.nextInt();

        System.out.print("Introduza o valor dos minutos:");
        int inputMinutos = input.nextInt();

        if (inputHoras >= 12) {
            if (inputHoras != 12){
                inputHoras = inputHoras - 12;
            }
        }


        if (inputHoras < 0 || inputHoras > 23 || inputMinutos < 0 || inputMinutos > 59) {
            System.out.println("Valor inválido.");
        }

    }
}
