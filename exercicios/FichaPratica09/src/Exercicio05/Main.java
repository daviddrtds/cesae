package Exercicio05;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("ze", 22, "ze@ze.com", "935 222 111");
        Pessoa pessoa2 = new Pessoa("ana", 26, "ana@ana.com", "932 777 222");

        pessoa1.verPessoa();
        pessoa2.verPessoa();

        Agenda agenda1 = new Agenda();

        agenda1.addPessoa(pessoa1);
        agenda1.verAgenda();
        agenda1.addPessoa(pessoa2);
        agenda1.verAgenda();


    }
}
