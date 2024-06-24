package FichaPratica04;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("-----------------");
            System.out.println("1.Criar");
            System.out.println("2.Atualizar");
            System.out.println("3.Eliminar");
            System.out.println("4.Sair");
            System.out.print("Escolha uma opção:");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Criar");
                    break;

                case 2:
                    System.out.println("Atualizar");
                    break;

                case 3:
                    System.out.println("Eliminar");
                    break;
            }

            if (escolha > 4) {
                System.out.println("Opção inválida");
            }

        } while (escolha != 4);


    }
}
