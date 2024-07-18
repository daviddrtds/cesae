package Exercicio03;

public class Main {


    public static void main(String[] args) {


        Animal burro1 = new Animal("Quim", "burro", "frança", 200, new String[]{"grao", "cenouras", "meloes"});

        burro1.comer("cenouras", 200);
        System.out.println(burro1.getPeso() + "kg");


    }
}
