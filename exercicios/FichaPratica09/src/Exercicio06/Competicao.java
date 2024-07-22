package Exercicio06;

public class Competicao {
    private String nomeComp;
    private String paisComp;
    private Atleta[] listaAtletas;


    public Competicao(String nomeComp, String paisComp) {
        this.nomeComp = nomeComp;
        this.paisComp = paisComp;
        this.listaAtletas = new Atleta[5000];
    }

    public void addAtleta(Atleta novoAtleta) {

        for (int i = 0; i < this.listaAtletas.length; i++) {

            if (this.listaAtletas[i] == null) {
                this.listaAtletas[i] = novoAtleta;
                return;
            }
        }
    }

    public void imprimirLista() {
        System.out.println("---" + this.nomeComp + " em " + this.paisComp + "---");
        System.out.println("---Lista de Inscritos---");
        for (int i = 0; i < this.listaAtletas.length && this.listaAtletas[i] != null; i++) {

            this.listaAtletas[i].detalhesAtleta();

        }
    }


}
