

abstract class FiguraGeometrica {

    private String cor;

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }


    public void mostrarCor() {
        System.out.println("A figura geométrica é " + this.cor);
    }


    abstract double calcularArea();

    abstract double calcularPerimetro();
}
