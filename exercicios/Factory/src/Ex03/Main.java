package Ex03;

import Ex02.FactoryTaco;
import Ex02.Taco;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        int userInput;
        String autor;
        String nome;


        do {
            System.out.println();
            System.out.println("------------------------------");
            System.out.println("------- Criar ficheiro -------");
            System.out.println("------------------------------");
            System.out.println("1. Ficheiro Word");
            System.out.println("2. Ficheiro Excel");
            System.out.println("3. Ficheiro PowerPoint");
            System.out.println("------------------------------");
            System.out.println("0. Sair");
            System.out.println();
            System.out.print("Escolha: ");
            userInput = scanner.nextInt();


            if (userInput == 0) {
                System.out.println("Saindo da criação de Ficheiros");
                return;
            }

            System.out.print("Introduza o seu nome: ");
            autor = scanner2.nextLine();
            System.out.print("Introduza o nome do ficheiro: ");
            nome = scanner2.nextLine();


            Document docFinal = FactoryDocument.newDocument(userInput, autor, nome);
            System.out.println("Documento criado com sucesso por " + autor);


            do {
                System.out.println();
                System.out.println("------ Utilizar ficheiro -----");
                System.out.println("------------------------------");
                System.out.println("1. Abrir ficheiro");
                System.out.println("2. Gravar ficheiro");
                System.out.println("3. Fechar ficheiro");
                System.out.println("------------------------------");
                System.out.println("0. Sair");
                System.out.print("Escolha: ");
                userInput = scanner.nextInt();
                System.out.println();


                switch (userInput) {
                    case 1:
                        docFinal.open();
                        break;
                    case 2:
                        docFinal.save();
                        break;
                    case 3:
                        docFinal.close();
                        break;

                }

            } while (userInput != 3);

            System.out.println();
            System.out.println("Deseja criar novo ficheiro?");
            System.out.println("------------------------------");
            System.out.println("1. Novo");
            System.out.println("0. Sair");
            userInput = scanner.nextInt();
            System.out.println();

        } while (userInput != 0);


    }
}
