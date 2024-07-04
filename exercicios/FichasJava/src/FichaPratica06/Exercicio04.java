package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Exercicio03.*;


public class Exercicio04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = input.nextInt();
        int escolha;


        do {
            System.out.println("Análise do número: " + num);
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Par ou Impar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            System.out.println("7. Sair");
            escolha = input.nextInt();


            switch (escolha) {

                case 1:
                    System.out.println("O número " + num + " é par? " + isPair(num));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("O número " + num + " é positivo? " + isPositive(num));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("O número " + num + " é primo? " + isPrime(num));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("O número " + num + " é perfeito? " + isPerfect(num));
                    break;
                case 5:
                    System.out.println("O número " + num + " é triangular? " + isTriangular(num));
                    break;
                case 6:
                    System.out.print("Insira um novo número: ");
                    num = input.nextInt();
                    break;
                case 7:
                    System.out.print("Adeuzinho");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (escolha != 7);

    }
}
