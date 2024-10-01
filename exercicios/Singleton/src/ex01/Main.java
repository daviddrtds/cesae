package ex01;

import java.io.IOException;

public class Main {


public static void main(String[] args) throws IOException {


    Logger novoLogger1 = Logger.getInstance("Ficheiro01");

    novoLogger1.log("01 - Item carro inserido com sucesso!");
    novoLogger1.log("02 - Item arroz inserido com sucesso!");


    Logger novoLogger2 = Logger.getInstance("Ficheiro02");
    novoLogger2.log("03 - Item pneu inserido com sucesso!");

}


}
