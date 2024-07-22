package Exercicio03;

public class Main {
    public static void main(String[] args) {


        Peixe peixe1 = new Peixe("faneca", 30, 5);
        Peixe peixe2 = new Peixe("sardinha", 40, 6);
        Peixe peixe3 = new Peixe("dourada", 50, 10);
        Peixe peixe4 = new Peixe("xixarro gigante", 3000, 10);


        Marisco marisco1 = new Marisco("ostra", 100, 30);
        Marisco marisco2 = new Marisco("mexilhão", 60, 20);
        Marisco marisco3 = new Marisco("lagosta", 200, 50);


        BarcoPesca barco1 = new BarcoPesca("Delfina", "vermelho", "1990", 15, 2500, MarcaBarco.SAVER);


        barco1.pescarPeixe(peixe1);
        barco1.pescarPeixe(peixe2);
        barco1.pescarPeixe(peixe4);
        barco1.pescarMarisco(marisco1);
        barco1.pescarMarisco(marisco2);
        barco1.verDetalhes();

    }
}
