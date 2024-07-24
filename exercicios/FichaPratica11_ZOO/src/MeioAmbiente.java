import SerVivo.SerVivo;

import java.util.ArrayList;

public class MeioAmbiente {

    private String nomeMeio;
    private double litrosAguaMeio;
    private ArrayList<SerVivo> listaSeres;


    public MeioAmbiente(String nomeMeio, double litrosAguaMeio) {
        this.nomeMeio = nomeMeio;
        this.litrosAguaMeio = litrosAguaMeio;
        this.listaSeres = new ArrayList<SerVivo>();
    }
}
