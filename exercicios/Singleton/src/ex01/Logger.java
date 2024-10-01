package ex01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private String name;


    private Logger(String name) {
        this.name = name;
    }


    public static Logger getInstance(String name) {

        if (instance == null) {
            instance = new Logger(name);
        }

        return instance;
    }


    File caminho = new File("C:/Users/sw2024/Desktop/cesae/exercicios/Singleton/src/ex01/log.txt");

    public void log(String log) throws IOException {

        FileWriter texto = new FileWriter(caminho, true);
        texto.append("\n" + log);
        texto.close();

    }

}
