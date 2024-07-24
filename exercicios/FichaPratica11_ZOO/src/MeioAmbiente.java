
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


    public void addSerVivo(SerVivo novoSer) {
        this.listaSeres.add(novoSer);
    }


    public void verMeio() {
        System.out.println("----- Seres vivos presentes em " + this.nomeMeio + " -----");
        System.out.println();
        for (SerVivo atual : this.listaSeres) {
            atual.verDetalhes();
            System.out.println();
            System.out.println("-------------------------------------------");
        }
    }


    public boolean plantaBebe(int indexPlanta) {

        double quantoBebe=0;

        this.listaSeres.get(indexPlanta)



    }
//
//
//    public boolean plantaComeInseto(int indexPlanta) {
//
//
//        if (this.listaSeres.contains())
//    }

}
