package Exercicio02;

import Exercicio02.Enums.TipoClasse;

public class Personagem extends Entidade {


    private int nivel;
    private TipoClasse tipoClasse;
    private String arma;

    public Personagem(String nome, int vida, int poder, int nivel, TipoClasse tipoClasse, String arma) {
        super(nome, vida, poder);
        this.nivel = nivel;
        this.tipoClasse = tipoClasse;
        this.arma = arma;
    }


    @Override
    void ataque() {

    }
}
