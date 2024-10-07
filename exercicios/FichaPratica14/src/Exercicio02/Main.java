package Exercicio02;

import Exercicio02.Enums.TipoClasse;

public class Main {
    public static void main(String[] args) {


        Personagem jogador1 = new Personagem("Bino", 30, 4, 1, TipoClasse.SOLDIER, "espada");

        Npc npc1 = new Npc("orc", 15, 2);
        Npc npc2 = new Npc("goblin", 5, 1);
        Npc npc3 = new Npc("necro", 20, 10);




        jogador1.ataque(npc1);
        jogador1.ataque(npc2);
        jogador1.ataque(npc3);




    }
}
