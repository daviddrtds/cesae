package Exercicio04;

public class Circulo {
    private int raio;

    /**
     * Metodo construtor para um circulo
     *
     * @param raio recebe o raio em cm
     */
    public Circulo(int raio) {
        this.raio = raio;
    }

    public int diametro() {
        return this.raio * 2;
    }

    public double area() {
        return 3.14 * (this.raio * this.raio);
    }

}
