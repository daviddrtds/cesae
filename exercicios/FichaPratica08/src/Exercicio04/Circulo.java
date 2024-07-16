package Exercicio04;

public class Circulo {
    private double raio;

    /**
     * Metodo construtor para um circulo
     *
     * @param raio recebe o raio em cm
     */
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double diametro() {
        return this.raio * 2;
    }

    public double area() {
        return 3.14 * (this.raio * this.raio);
    }

}
