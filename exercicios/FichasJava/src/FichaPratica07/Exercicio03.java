package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio03 {

    public static void leECriaFicheiro(String pathOrigem, String nomeNovo) throws FileNotFoundException {

        File fileOrigem = new File(pathOrigem);

        File fileFinal = new File("FicheirosFicha07/" + nomeNovo + ".txt");

        Scanner scannerFicheiro = new Scanner(fileOrigem);

        while (scannerFicheiro.hasNext()) {
            String linhaAtual = scannerFicheiro.nextLine();
            PrintWriter novoPrint = new PrintWriter(fileFinal);
            novoPrint.println(linhaAtual);
            novoPrint.close();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        leECriaFicheiro("FicheirosFicha07/exercicio_01.txt", "testetestetesteCopia");
    }
}
