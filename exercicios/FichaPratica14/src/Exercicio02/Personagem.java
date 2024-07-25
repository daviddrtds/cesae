package Exercicio02;

import Exercicio02.Enums.TipoClasse;

public class Personagem extends Entidade {


    private int nivel;
    private TipoClasse tipoClasse;
    private String arma;

    public Personagem(String nome, double vida, double poder, int nivel, TipoClasse tipoClasse, String arma) {
        super(nome, vida, poder);
        this.nivel = nivel;
        this.tipoClasse = tipoClasse;
        this.arma = arma;
    }


    public void addLvl() {
        this.vida = this.vida + (this.vida * 0.1);
        this.poder = this.poder + (this.poder * 0.1);
        this.nivel++;
    }


    @Override
    void ataque(Npc inimigo) {

        int count = 0;

        do {

            inimigo.vida = inimigo.vida - this.poder;

            if (inimigo.vida <= 0) {
                count++;
                System.out.println("Parabéns " + this.tipoClasse + " " + this.nome + " ganhou um combate contra " + inimigo.nome + ", com o uso de " + this.arma + " no " + count + "ª turno.");
                this.addLvl();
                return;
            }

            this.vida = this.vida - inimigo.poder;

            if (this.vida <= 0) {
                System.out.println("Jogador morreu");
                return;
            }

            count++;
            System.out.println();
            System.out.println("Fim do " + count + "ª turno");
            System.out.println("Vida do jogador: " + this.vida);
            System.out.println("Vida do inimigo: " + inimigo.vida);
            System.out.println();


        } while (this.vida >= 0 && inimigo.vida >= 0);


    }
}
