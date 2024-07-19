package Exercicio05;

public class Pessoa {

    private String nome;
    private int idade;
    private String email;
    private String telemovel;

    public Pessoa(String nome, int idade, String email, String telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telemovel = telemovel;
    }


    public void verPessoa() {
        System.out.println("nome: " + this.nome + " | idade: " + this.idade + " | email: " + this.email + " | telemovel: " + this.telemovel);
    }
}
