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
        String cabecalho = scanner2.nextLine();
        String cabecalho2= scanner2.nextLine();
        String[] arr2 = cabecalho2.split(",");
        String[][] matrix1 = new String[numLinhas][arr1.length];

//        while (scanner2.hasNextLine()) {
//            primeiraLinha = scanner2.nextLine();
//            arr1 = primeiraLinha.split(",");
//
//            for (int i = 0; i < matrix1.length; i++) {
//                for (int j = 0; j < matrix1[0].length; j++) {
//                    matrix1[i][j] = arr1[j];
//                }
//
//                primeiraLinha = scanner2.nextLine();
//                arr1 = primeiraLinha.split(",");
//            }
//        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] = arr2[j];
            }
            cabecalho2 = scanner2.nextLine();
            arr2 = cabecalho2.split(",");
        }

        return matrix1;
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
