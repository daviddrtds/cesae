package Exercicio05;

public class Agenda {

    private Pessoa[] listaAgenda;

    public Agenda() {
        this.listaAgenda = new Pessoa[20];
    }


    public void addPessoa(Pessoa novaPessoa) {

        for (int i = 0; i < this.listaAgenda.length; i++) {

            if (this.listaAgenda[i] == null) {
                this.listaAgenda[i] = novaPessoa;
                return;
            }
        }
    }


    public void verAgenda() {

        System.out.println("---Agenda---");
        for (int i = 0; i < this.listaAgenda.length && this.listaAgenda[i] != null; i++) {
            listaAgenda[i].verPessoa();
        }
    }
}
