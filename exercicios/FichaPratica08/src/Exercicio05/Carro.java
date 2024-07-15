package Exercicio05;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    /**
     * Método construtor para Carro
     * @param marca string marca
     * @param modelo string modelo
     * @param ano integer ano de fabrico
     */
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O carro está ligado");
    }
}
