package Exercicio03;

public class Animal {
    private String nome;
    private String especie;
    private String pais;
    private double peso;
    private String[] alimentacao;


    public Animal(String nome, String especie, String pais, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }


    public void comer(String alimento, double pesoAlimento) {

        for (int i = 0; i < this.alimentacao.length; i++) {
            if (alimento.equals(this.alimentacao[i])) {
                System.out.println("O " + this.especie + " comeu.");
                this.peso += (pesoAlimento / 1000);
                return;
            }
        }
        System.out.println("O " + this.especie + " recusou essa comida.");
    }

    public double getPeso() {
        return this.peso;
    }


}