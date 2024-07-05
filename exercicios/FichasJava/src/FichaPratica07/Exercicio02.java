package FichaPratica07;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercicio02 {


    public static void criaTxt(String nome, String texto) throws FileNotFoundException {

        File file = new File("FicheirosFicha07/" + nome + ".txt");
        PrintWriter novoPrint = new PrintWriter(file);
        novoPrint.println(texto);
        novoPrint.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        criaTxt("testeteste", "ayyyyyyyyyyy");
    }
}
