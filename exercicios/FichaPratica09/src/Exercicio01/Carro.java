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

    public void detalhes(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Potência: " + this.potencia);
        System.out.println("Cilindrada: " + this.cilindrada);
        System.out.println("Combustível: " + this.tipoCombustivel);
        System.out.println("Litros aos 100km: " + this.litros100);
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


    public Carro corrida(Carro adversario) {

        if (this.potencia != adversario.potencia) {
            if (this.potencia > adversario.potencia) {
                return this;
            } else {
                return adversario;
            }
        } else if (this.cilindrada != adversario.cilindrada) {
            if (this.cilindrada > adversario.cilindrada) {
                return this;
            } else {
                return adversario;
            }
        } else if (this.ano != adversario.ano) {
            if (this.ano > adversario.ano) {
                return this;
            } else {
                return adversario;
            }
        } else {
            return null;
        }
    }

    public double distancia(double kms) {
        return (this.litros100 / 100) * kms;
    }

}







