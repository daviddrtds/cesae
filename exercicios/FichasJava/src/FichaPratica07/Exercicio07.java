package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio07 {

    public static void contarLinhas(String path) throws FileNotFoundException {

        File fileTxt = new File(path);
        Scanner scanner = new Scanner(fileTxt);

        int contaLinhas = 0;
        int contaPalavras = 0;

        while (scanner.hasNext()) {
            String novaLinha = scanner.nextLine();
            String[] arr = novaLinha.split(" ");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("")) {
                } else {
                    contaPalavras++;
                }
            }
            if (novaLinha.equals("")) {
            } else {
                contaLinhas++;
            }
        }

        System.out.println("O total de linhas do ficheiro é " + contaLinhas + " e o total de palavras é " + contaPalavras);
    }


    public static void main(String[] args) throws FileNotFoundException {
        contarLinhas("FicheirosFicha07/exercicio_07.txt");
    }
}
