package Exercicio02;

public class Main {
    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa("ze", 22, "923333333", "ze@ze");
        Pessoa pessoa2 = new Pessoa("manel", 25, "923444111", "manel@manel");
        Pessoa pessoa3 = new Pessoa("carlos", 27, "923774111", "carlos@carlos");
        Pessoa pessoa4 = new Pessoa("celso", 15, "923222777", "celso@celso");

        Sorteio sorteio1 = new Sorteio(3000.0);


        sorteio1.addPessoa(pessoa1);
        sorteio1.addPessoa(pessoa2);
        sorteio1.addPessoa(pessoa3);
        sorteio1.addPessoa(pessoa4);

        sorteio1.imprimirLista();

        sorteio1.sortear().verDetalhes();

    }
}
