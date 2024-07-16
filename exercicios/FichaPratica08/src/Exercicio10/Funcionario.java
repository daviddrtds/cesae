package Exercicio10;

public class Funcionario {

    private String nome;
    private double salario;
    private String departamento;


    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirDados() {
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Departamento: " + this.departamento);
    }

    public void aumentarSalario(double salario) {
        this.salario = this.salario + (this.salario * (salario / 100));
    }

}
