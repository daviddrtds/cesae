package Exercicio02;

abstract class Entidade {

    private String nome;
    private int vida;
    private int poder;


    public Entidade(String nome, int vida, int poder) {
        this.nome = nome;
        this.vida = vida;
        this.poder = poder;
    }


    abstract void ataque();

}
