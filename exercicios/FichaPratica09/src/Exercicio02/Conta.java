package Exercicio02;

public class Conta {

    private String nome;
    private int numeroConta;
    private double saldo;
    private String ano = "2023";
    private double margemEmp = 0.9;
    private double divida;

    public Conta(String nome, int numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public void depositarValor(double valor) {
        this.saldo += valor;
    }

    public boolean pedirEmprestimo(int valorEmprestimo) {
        if (valorEmprestimo > this.saldo * margemEmp || this.divida > 0) {
            return false;
        }

        this.divida += valorEmprestimo;
        this.saldo += valorEmprestimo;
        return true;

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
