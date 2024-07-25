package Exercicio03;

abstract class Pessoa {

    protected String nome;
    protected int anoNascimento;
    protected String email;
    protected String telemovel;

    public Pessoa(String nome, int anoNascimento, String email, String telemovel) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
        this.telemovel = telemovel;
    }


    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome + " | Nascimento: " + this.anoNascimento + " | Email: " + this.email + " | Telemóvel: " + this.telemovel);
    }

    abstract void obterFuncao();

    abstract void imprimirHorario();

}
