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

        double tempJogador = this.vida;
        double tempNpc = inimigo.vida;
        int count = 0;

        do {

            tempNpc -= this.poder;

            if (tempNpc <= 0) {
                count++;
                System.out.println("Parabéns " + this.tipoClasse + " " + this.nome + " ganhou um combate contra " + inimigo.nome + ", com o uso de " + this.arma + " no " + count + "ª turno.");
                this.addLvl();
                System.out.println("Stats atuais: " + this.vida + "/vida, " + this.poder + "/poder, e subiu para o nível " + this.nivel);
                return;
            }

            tempJogador -= inimigo.poder;

            if (tempJogador <= 0) {
                count++;
                System.out.println("Jogador morreu no " + count + "ª turno contra um " + inimigo.nome);
                return;
            }

            count++;
            System.out.println();
            System.out.println("Fim do " + count + "ª turno");
            System.out.println("Vida do jogador: " + tempJogador);
            System.out.println("Vida do inimigo: " + tempNpc);
            System.out.println();


        } while (tempJogador >= 0 && tempNpc >= 0);


    }
}
