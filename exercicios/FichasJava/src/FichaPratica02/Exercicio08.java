package FichaPratica02;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Introduz as três notas dos teus testes");

        System.out.print("Primeira nota:");
        double nota1 = input.nextDouble() * 0.25;

        System.out.print("Segunda nota:");
        double nota2 = input.nextDouble() * 0.35;

        System.out.print("Terceira nota:");
        double nota3 = input.nextDouble() * 0.40;

        double notaFinal = nota1 + nota2 + nota3;

        if (notaFinal >= 9.5) {
            System.out.println("Parabéns, a tua média é de: " + notaFinal + ". Estás Aprovado!");
        } else {
            System.out.println("A tua média é de: " + notaFinal + ". Infelizmente Reprovaste!");
        }

    }
}
