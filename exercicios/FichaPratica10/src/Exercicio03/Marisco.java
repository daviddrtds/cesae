package Exercicio03;

public class Marisco {

    private String especie;
    private double peso;
    private double precoKg;


    public Marisco(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }


    public void verDetalhesMarisco() {
        System.out.println("Espécie: " + this.especie + " | " + this.peso + " | " + this.precoKg + "/kg");
    }
}
