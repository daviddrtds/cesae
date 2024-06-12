package FichaPratica02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza a posição em que terminou a corrida:");
        int posicaoFim = input.nextInt();

        switch (posicaoFim) {
            case 1:
                System.out.println("Parabéns, terminou em primeiro lugar, ganhou: 10 pontos!");
                break;
            case 2:
                System.out.println("Terminou em segundo lugar, ganhou: 8 pontos!");
                break;
            case 3:
                System.out.println("Terminou em terceiro lugar, ganhou: 6 pontos!");
                break;
            case 4:
                System.out.println("Terminou em quarto lugar, ganhou: 5 pontos!");
                break;
            case 5:
                System.out.println("Terminou em quinto lugar, ganhou: 4 pontos!");
                break;
            case 6:
                System.out.println("Terminou em sexto lugar, ganhou: 3 pontos!");
                break;
            case 7:
                System.out.println("Terminou em sétimo lugar, ganhou: 2 pontos!");
                break;
            case 8:
                System.out.println("Terminou em oitavo lugar, ganhou: 1 pontos!");
                break;
            default:
                System.out.println("Não ganhou nenhum ponto!");

        }


    }
}
