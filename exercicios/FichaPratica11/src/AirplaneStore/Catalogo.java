package AirplaneStore;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Aviao> listaAvioes;

    public Catalogo() {
        this.listaAvioes = new ArrayList<Aviao>();
    }

    public void comprarAviao(Aviao novoAviao) {
        this.listaAvioes.add(novoAviao);
    }


}
