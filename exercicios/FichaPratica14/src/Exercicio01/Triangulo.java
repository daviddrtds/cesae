package Exercicio01;

public class Triangulo extends FiguraGeometrica {

    private double altura;
    private double base;
    private double ladoA;
    private double ladoB;


    public Triangulo(String cor, double altura, double base, double ladoA, double ladoB) {
        super(cor);
        this.altura = altura;
        this.base = base;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    double calcularPerimetro() {
        return this.base + this.ladoB + this.ladoA;
    }
}
