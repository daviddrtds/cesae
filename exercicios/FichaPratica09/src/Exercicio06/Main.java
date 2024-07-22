package Exercicio06;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("ze", "natação", "1.99", "90", "portugal");
        Atleta atleta2 = new Atleta("ana", "lançamento dardo", "1.79", "70", "roménia");
        Atleta atleta3 = new Atleta("zeza", "lançamento dardo", "1.90", "75", "rússia");
        Atleta atleta4 = new Atleta("carla", "lançamento dardo", "1.75", "73", "grécia");
        Atleta atleta5 = new Atleta("manuela", "lançamento dardo", "1.69", "72", "espanha");
        Atleta atleta6 = new Atleta("vasco", "natação", "2.10", "90", "roménia");
        Atleta atleta7 = new Atleta("andre", "natação", "1.88", "86", "itália");


        Competicao lancamentoDardo = new Competicao("lançamento dardo", "Portugal");


        lancamentoDardo.addAtleta(atleta2);
        lancamentoDardo.addAtleta(atleta3);
        lancamentoDardo.addAtleta(atleta4);
        lancamentoDardo.addAtleta(atleta5);

        lancamentoDardo.imprimirLista();

    }
}
