package Exercicio01;

public class Main {
    public static void main(String[] args) {

        Carro concorrente1 = new Carro("honda", "civic", 1998, 90, 1.4, Combustivel.GASOLINA, 8.0);

        Carro concorrente2 = new Carro("seat", "ibiza", 2001, 120, 2.0, Combustivel.DIESEL, 12);

        System.out.println("Consome " + concorrente1.distancia(97) + " litros.");

        concorrente1.ligar();


        if (concorrente1.corrida(concorrente2) == null) {
            System.out.println("empate");
        } else {
            System.out.println("o carro vencedor é:");
            concorrente1.corrida(concorrente2).detalhes();
        }

    }
}

