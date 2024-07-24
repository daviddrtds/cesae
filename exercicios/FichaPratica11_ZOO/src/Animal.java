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

    @Override
    public void verDetalhes() {
        super.verDetalhes();
        System.out.println("Precisa comer? " + this.fomeAnimal);
        System.out.println("Peso: " + this.pesoAnimal + " Kg");
        System.out.println("Nível inteligência: " + this.inteligenciaAnimal+"/100");
        System.out.println("Dieta: " + this.dietaAnimal);
        System.out.println("Som que produz: " + this.barulhoAnimal);
    }

    public boolean isFomeAnimal() {
        return fomeAnimal;
    }

    public double getPesoAnimal() {
        return pesoAnimal;
    }

    public double getInteligenciaAnimal() {
        return inteligenciaAnimal;
    }

    public DietaAnimal getDietaAnimal() {
        return dietaAnimal;
    }

    public String getBarulhoAnimal() {
        return barulhoAnimal;
    }
}
