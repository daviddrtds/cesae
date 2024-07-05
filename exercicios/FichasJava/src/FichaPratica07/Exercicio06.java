package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio06 {


    public static String[] lerTxt(String path) throws FileNotFoundException {

        File fileTxt = new File(path);
        Scanner scanner = new Scanner(fileTxt);

        int maior = 0;
        String nome = "vazio";

        while (scanner.hasNext()) {
            String atual = scanner.nextLine();
            String[] arr = atual.split(",");
            int num = Integer.parseInt(arr[1]);
            if (num > maior) {
                maior = num;
                nome = arr[0];
            }
        }

        String[] retorno = new String[]{nome, String.valueOf(maior)};

//        return maior;
        return retorno;
    }


    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("A pessoa mais velha é: " + lerTxt("FicheirosFicha07/exercicio_06.txt")[0] + " e tem " + lerTxt("FicheirosFicha07/exercicio_06.txt")[1] + " anos.");

    }

}






