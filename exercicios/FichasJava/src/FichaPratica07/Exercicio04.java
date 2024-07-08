package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio04 {

    public static void lerExcel(String path) throws FileNotFoundException {

        File fileOrigem = new File(path);
        Scanner scannFicheiro = new Scanner(fileOrigem);

        while (scannFicheiro.hasNextLine()) {
            String novaLinha = scannFicheiro.nextLine();
            String[] arr = novaLinha.split(";");
            for (int i = 0; i < arr.length; i++) {

                arr[i] = arr[i].trim();
                arr[i] = " " + arr[i] + " ";

                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        lerExcel("FicheirosFicha07/exercicio_04.csv");
    }
}
