package Exercicio03;

public class Retangulo {

    private int largura;
    private int comprimento;

    public Retangulo(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public int area() {
        return this.largura * this.comprimento;
    }

    public int perimetro() {
        return (this.comprimento * 2) + (this.largura * 2);
    }

}
