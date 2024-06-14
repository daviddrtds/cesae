package FichaPratica02;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o valor das horas:");
        int inputHoras = input.nextInt();

        System.out.print("Introduza o valor dos minutos:");
        int inputMinutos = input.nextInt();


        String formato;
        if(inputHoras >= 12){
            formato = "PM";
        } else{
            formato = "AM";
        }




        if (inputHoras < 0 || inputHoras > 23 || inputMinutos < 0 || inputMinutos > 59) {
            System.out.println("Valor inválido.");
        }  else if (inputHoras > 12) {
            System.out.println(inputHoras - 12 + ":" + inputMinutos + formato);
        }  else if (inputHoras < 10 && inputMinutos < 10) {
            System.out.println("0" + inputHoras + ":0" + inputMinutos + formato);
        } else if (inputHoras < 10 && inputMinutos > 10) {
            System.out.println("0" + inputHoras + ":" + inputMinutos + formato);
        } else if (inputHoras > 10 && inputMinutos < 10) {
            System.out.println(inputHoras + ":0" + inputMinutos + formato);
        } else {
            System.out.println(inputHoras + ":" + inputMinutos + formato);
        }


    }
}
