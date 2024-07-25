package Exercicio02;

import Exercicio02.Enums.TipoClasse;

public class Main {
    public static void main(String[] args) {


        Personagem jogador1 = new Personagem("Bino", 30, 4, 1, TipoClasse.SOLDIER, "espada");

        Npc npc1 = new Npc("orc", 15, 2);



        jogador1.ataque(npc1);



    }
}
