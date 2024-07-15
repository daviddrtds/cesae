package Exercicio01;

public class Main {
    public static void main(String[] args) {
        Pessoa vitor = new Pessoa("Vitor", 24, 1.7);
        Pessoa ana = new Pessoa("Ana", 22, 1.6);


        System.out.println("-----Informações das pessoas-----");
        System.out.println();
        System.out.println("Nome: " + vitor.getNome());
        System.out.println("Idade: " + vitor.getIdade());
        System.out.println("Altura: " + vitor.getAltura());
        System.out.println();
        System.out.println("Nome: " + ana.getNome());
        System.out.println("Idade: " + ana.getIdade());
        System.out.println("Altura: " + ana.getAltura());
    }
}
