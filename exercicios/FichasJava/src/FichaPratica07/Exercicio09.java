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
        String[] arr1 = primeiraLinha.split(",");


        while (scanner.hasNextLine()) {
            primeiraLinha = scanner.nextLine();
            numLinhas++;
        }

        Scanner scanner2 = new Scanner(fileTxt);

        String[][] matrix1 = new String[numLinhas][arr1.length];

        while (scanner.hasNextLine()) {
            primeiraLinha = scanner.nextLine();
            arr1 = primeiraLinha.split(",");
            matrix1 = new String[numLinhas][arr1.length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    matrix1[i][j] = arr1[j];
                }
            }
        }

        return matrix1;


    }


    public static void main(String[] args) throws FileNotFoundException {

        String[][] matrizTotal = tabelaMusica("");

        for (int i = 0; i < matrizTotal.length; i++) {
            for (int j = 0; j < matrizTotal[0].length; j++) {
                System.out.print(matrizTotal[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
