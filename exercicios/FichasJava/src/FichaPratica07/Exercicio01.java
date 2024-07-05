package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio01 {


    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        File fileTxt = new File(path);
        Scanner scannerFicheiro = new Scanner(fileTxt);

        while (scannerFicheiro.hasNext()) {
            String linhaAtual = scannerFicheiro.nextLine();
            System.out.println(linhaAtual);
        }

    }


    public static void main(String[] args) throws FileNotFoundException {

        imprimirFicheiro("FicheirosFicha07/exercicio_01.txt");

    }
}

