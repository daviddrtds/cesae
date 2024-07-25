package Exercicio02;

abstract class Entidade {

    protected String nome;
    protected double vida;
    protected double poder;


    public Entidade(String nome, double vida, double poder) {
        this.nome = nome;
        this.vida = vida;
        this.poder = poder;
    }


    abstract void ataque(Npc inimigo);

}
