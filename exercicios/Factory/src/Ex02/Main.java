package Ex02;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;

        int userInput;

        do {
            System.out.println();
            System.out.println("---- Bem-vindo à TACOTACO ----");
            System.out.println("------------ Menu ------------");
            System.out.println("------------------------------");
            System.out.println("1. Beef Taco");
            System.out.println("2. Chicken Taco");
            System.out.println("3. Veggie Taco");
            System.out.println("------------------------------");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            userInput = scanner.nextInt();
            System.out.println();

            if (userInput == 0) {
                System.out.println("Obrigado pela Visita, volte sempre");
                return;
            }

            Taco tacoFinal = FactoryTaco.newTaco(userInput);
            System.out.println("Pedido nº " + randomNumber + " registado com sucesso!");
            tacoFinal.prepare();
            tacoFinal.bake();
            tacoFinal.box();
            System.out.println("A entregar pedido nº: " + randomNumber);
            System.out.println("Bom Apetite!");
            System.out.println("...");

            System.out.println();
            System.out.println("Deseja fazer novo Pedido?");
            System.out.println("------------------------------");
            System.out.println("1. Novo Pedido");
            System.out.println("0. Sair");
            userInput = scanner.nextInt();

        } while (userInput != 0);


    }
}
