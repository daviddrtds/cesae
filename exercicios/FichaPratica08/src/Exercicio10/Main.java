package Exercicio10;

public class Main {
    public static void main(String[] args) {

        Funcionario novoFunc1 = new Funcionario("ze", 1380, "it");


        novoFunc1.exibirDados();
        novoFunc1.aumentarSalario(10);
        novoFunc1.exibirDados();

    }
}
