package Exercicio02;

public class Main {
    public static void main(String[] args) {

        Cao rex = new Cao("Rex", "Rafeiro");
        Cao max = new Cao("Max", "Pastor Belga");
        Cao nicha = new Cao("Nicha", "Boxer");

        rex.ladrar();
        max.ladrar();
        nicha.ladrar();

        nicha.setLatido("ayyyyy");
        max.setLatido("lololol");

        nicha.ladrar();

    }
}
