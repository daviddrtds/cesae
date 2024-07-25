


public class Circulo extends FiguraGeometrica {

    private double raio;


    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }


    @Override
    double calcularArea() {
        return 3.14 * (this.raio * this.raio);
    }

    @Override
    double calcularPerimetro() {
        return (2 * 3.14) * this.raio;
    }
}
