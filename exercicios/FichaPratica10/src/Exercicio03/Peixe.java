package Exercicio03;

public class Peixe {

    private String especie;
    private double peso;
    private double precoKg;


    public Peixe(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }


    public void verDetalhesPeixe() {
        System.out.println("Espécie: " + this.especie + " | " + this.peso + " | " + this.precoKg + "/kg");
    }
}
