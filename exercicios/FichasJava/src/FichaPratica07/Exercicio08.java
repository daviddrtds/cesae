package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio08 {


    public static double totalVenda(String path) throws FileNotFoundException {

        File fileTxt = new File(path);
        Scanner scanner = new Scanner(fileTxt);

        String primeiraLinha = scanner.nextLine();
        double total = 0;

        while (scanner.hasNextLine()) {
            primeiraLinha = scanner.nextLine();
            String[] arr = primeiraLinha.split(",");
            double vendidos = Double.parseDouble(arr[2]);
            double preco = Double.parseDouble(arr[3]);
            total = total + (vendidos * preco);
        }
        return total;
    }


    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Valor total de vendas: " + totalVenda("FicheirosFicha07/exercicio_08.csv"));
    }

}
