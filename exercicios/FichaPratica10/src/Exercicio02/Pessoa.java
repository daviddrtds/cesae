package Exercicio02;

public class Pessoa {
    private String nome;
    private int idade;
    private String telemovel;
    private String email;


    public Pessoa(String nome, int idade, String telemovel, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telemovel = telemovel;
        this.email = email;
    }


    public void verDetalhes() {
        System.out.println(this.nome + " | " + this.idade + " | " + this.telemovel + " | " + this.email);
    }


    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
