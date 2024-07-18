package Exercicio01;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private double cilindrada;
    private Combustivel tipoCombustivel;
    private double litros100;


    public Carro(String marca, String modelo, int ano, int potencia, double cilindrada, Combustivel tipoCombustivel, double litros100) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100 = litros100;
    }

    public void ligar() {
        if (2024 - this.ano > 30) {
            if (this.tipoCombustivel.equals(Combustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo… Custa a pegar… O carro está ligado! Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar… O carro está ligado! Vrum-vrum-vrum");
            }
        } else {
            if (this.potencia < 250) {
                System.out.println("O carro está ligado! Vruummmmmmm");
            } else {
                System.out.println("O carro está ligado! VRUUUUUUUUUMMMMMM”");
            }

        }
    }


    public String corrida(Carro adversario) {

        if (this.potencia >= adversario.potencia || this.cilindrada > adversario.cilindrada) {
            return this.marca;
        }
    }

}






