package SerVivo;

import Enums.DietaAnimal;

public class Animal extends SerVivo {

    private boolean fomeAnimal;
    private double pesoAnimal;
    private double inteligenciaAnimal;
    private DietaAnimal dietaAnimal;
    private String barulhoAnimal;


    public Animal(String nome, String especie, String paisOrigem, int idade, boolean fomeAnimal, double pesoAnimal, double inteligenciaAnimal, DietaAnimal dietaAnimal, String barulhoAnimal) {
        super(nome, especie, paisOrigem, idade);
        this.fomeAnimal = fomeAnimal;
        this.pesoAnimal = pesoAnimal;
        this.inteligenciaAnimal = inteligenciaAnimal;
        this.dietaAnimal = dietaAnimal;
        this.barulhoAnimal = barulhoAnimal;
    }
}
