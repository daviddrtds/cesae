import Enums.TipoPlanta;

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

        double quantoBebe = 0;

        if (this.listaSeres.get(indexPlanta) instanceof Planta) {
            Planta estaPlanta = (Planta) this.listaSeres.get(indexPlanta);
            if (estaPlanta.getTipoPlanta().equals(TipoPlanta.ARVORE)) {
                quantoBebe = 1;
                this.litrosAguaMeio -= quantoBebe;
                return true;
            } else if (estaPlanta.getTipoPlanta().equals(TipoPlanta.FLOR)) {
                quantoBebe = 0.1;
                this.litrosAguaMeio -= quantoBebe;
                return true;
            } else if (estaPlanta.getTipoPlanta().equals(TipoPlanta.ERVA)) {
                quantoBebe = 0.25;
                this.litrosAguaMeio -= quantoBebe;
                return true;
            }


        }

        this.listaSeres.remove(this.listaSeres.get(indexPlanta));
        return false;
    }
//
//
//    public boolean plantaComeInseto(int indexPlanta) {
//
//
//        if (this.listaSeres.contains())
//    }

}
