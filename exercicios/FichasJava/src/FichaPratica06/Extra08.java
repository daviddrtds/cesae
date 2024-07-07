package FichaPratica06;

import java.util.Scanner;

public class Extra08 {


    public static boolean vogal(String letra) {


        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza uma letra: ");
        String letra = input.next();

        if (vogal(letra)) {
            System.out.println("Essa letra é uma vogal!");
        } else {
            System.out.println("Essa letra é uma consoante!");
        }

    }
}
