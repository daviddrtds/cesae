package FichaPratica06;

import java.util.Scanner;

public class Exercicio01 {

    public static void fazerBarulho(String animal) {

        switch (animal) {
            case "cão":
                System.out.println("Au Au Au");
                break;

            case "gato":
                System.out.println("Miau Miau Miau");
                break;

            case "peixe":
                System.out.println("Glu Glu Glu");
                break;

            case "vaca":
                System.out.println("Muuuu");
                break;

            case "porco":
                System.out.println("Oink");
                break;

            default:
                System.out.println("Tente outro animal");
                break;
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o nome de um animal: ");
        String animal = input.next().toLowerCase();


        fazerBarulho(animal);


    }
}
