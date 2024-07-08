package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio09 {


    public static String[][] tabelaMusica(String path) throws FileNotFoundException {

        File fileTxt = new File(path);
        Scanner scanner = new Scanner((fileTxt));
        String primeiraLinha = scanner.nextLine();

        int numLinhas = 0;

        while (scanner.hasNextLine()) {
            primeiraLinha = scanner.nextLine();
            numLinhas++;
        }

        String[][] matrixCompleta = new String[numLinhas][4];

        Scanner scanner2 = new Scanner((fileTxt));
        String segundaLinha = scanner2.nextLine();
        int contaLinhaMatrix = 0;

        while (scanner2.hasNextLine()) {
            segundaLinha = scanner2.nextLine();
            String[] arr1 = segundaLinha.split(",");

            for (int i = 0; i < matrixCompleta[0].length; i++) {
                matrixCompleta[contaLinhaMatrix][i] = arr1[i];
            }
            contaLinhaMatrix++;
        }

        return matrixCompleta;
    }


    public static void menu() {

        Scanner input = new Scanner(System.in);
        int opcao = 0;



        do {
            System.out.println("Programa de músicas");
            System.out.println("1. Pesquisar por género");
            System.out.println("2. Pesquisar por artista");
            System.out.println("3. Pesquisar por duração");
            System.out.println("4. Pesquisar por duração acima de x");
            System.out.println("5. Número de músicas no ficheiro");
            System.out.println("6. Sair");
            opcao = input.nextInt();

            switch(opcao){



            }




        } while (opcao != 6);

    }


    public static void main(String[] args) throws FileNotFoundException {

        String[][] matrizTotal = tabelaMusica("FicheirosFicha07/exercicio_09.csv");

        for (int i = 0; i < matrizTotal.length; i++) {
            for (int j = 0; j < matrizTotal[0].length; j++) {
                System.out.print(matrizTotal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
