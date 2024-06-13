package FichaPratica02;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma opção do Menu:");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");
        int inputMenu = input.nextInt();


        switch (inputMenu) {

            case 1:
                System.out.println("1. Criar");
                break;

            case 2:
                System.out.println("2. Atualizar");
                break;

            case 3:
                System.out.println("3. Eliminar");
                break;

            case 4 : break;

            default:
                System.out.println("Opção inválida. Escolha uma opção de 1 a 4.");
        }




    }
}
