package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio05 {


    public static int lerSoma(String path) throws FileNotFoundException {

        File fileOrigem = new File(path);
        Scanner lerFile = new Scanner(fileOrigem);

        int soma = 0;

        while (lerFile.hasNext()) {
            int num = lerFile.nextInt();
            soma = soma + num;
        }
        return soma;
    }


    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(lerSoma("FicheirosFicha07/exercicio_05_31.txt"));

    }
}
