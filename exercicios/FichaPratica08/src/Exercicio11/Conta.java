package Exercicio11;

public class Conta {

    private String nome;
    private int numeroConta;
    private double saldo;

    public Conta(String nome, int numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public void depositarValor(double valor) {
        this.saldo += valor;
    }


    public void levantarValor(double valor) {
        if (this.saldo < valor) {
            System.out.println("Valor insuficiente");
        } else {
            this.saldo -= valor;
        }
    }


    public void mostrarSaldo() {
        System.out.println("Saldo da conta nº" + this.numeroConta + " -> " + this.saldo + "€");
    }


    public void transferencia(double valor, Conta nomeConta) {
        if (this.saldo < valor) {
            System.out.println("Valor insuficiente");
        } else {
            this.saldo -= valor;
            nomeConta.depositarValor(valor);
        }
    }
}
