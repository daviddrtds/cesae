package Exercicio01;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    /**
     * Método construtor para Pessoa
     *
     * @param nome   primeiro nome
     * @param idade  idade
     * @param altura altura em metros
     */
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
