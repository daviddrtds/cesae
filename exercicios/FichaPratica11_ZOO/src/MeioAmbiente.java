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

        if (this.listaSeres.get(indexPlanta) instanceof Planta && this.litrosAguaMeio >= 1) {
            Planta estaPlanta = (Planta) this.listaSeres.get(indexPlanta);

            if (estaPlanta.getTipoPlanta().equals(TipoPlanta.ARVORE)) {
                quantoBebe = 1;
                this.litrosAguaMeio -= quantoBebe;
                System.out.println("- É do tipo árvore, bebeu 1 litro");
                System.out.println("- Sobraram " + this.litrosAguaMeio + "L de água.");
                return true;
            } else if (estaPlanta.getTipoPlanta().equals(TipoPlanta.FLOR)) {
                quantoBebe = 0.1;
                this.litrosAguaMeio -= quantoBebe;
                System.out.println("- É do tipo flor, bebeu 0.1 litros");
                System.out.println("- Sobraram " + this.litrosAguaMeio + "L de água.");
                return true;
            } else if (estaPlanta.getTipoPlanta().equals(TipoPlanta.ERVA)) {
                quantoBebe = 0.25;
                this.litrosAguaMeio -= quantoBebe;
                System.out.println("- É do tipo erva, bebeu 0.25 litros");
                System.out.println("- Sobraram " + this.litrosAguaMeio + "L de água.");
                return true;
            }
        }

        this.listaSeres.remove(this.listaSeres.get(indexPlanta));
        System.out.println();
        System.out.println("- A planta não consegui água e morreu!");
        System.out.println();
        return false;
    }


    public boolean plantaComeInseto(int indexPlanta) {

        if (this.listaSeres.get(indexPlanta) instanceof Planta) {
            Planta estaPlanta = (Planta) this.listaSeres.get(indexPlanta);

            if (estaPlanta.getTipoPlanta().equals(TipoPlanta.COME_INSETOS)) {

                for (SerVivo atual : this.listaSeres) {
                    if (atual instanceof Inseto) {
                        this.listaSeres.remove(atual);
                        System.out.println();
                        System.out.println("- A planta comeu o inseto " + atual.especie);
                        System.out.println();
                        return true;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("- Não existem insetos na " + this.nomeMeio + ", a planta morreu!");
        System.out.println();
        this.listaSeres.remove(this.listaSeres.get(indexPlanta));
        return false;
    }


    public void plantaAbanaComVento(int indexPlanta) {
        System.out.println();
        System.out.println("- Está muito vento");
        System.out.println();
    }


    public void animalFazBarulho(int indexAnimal) {

        if (this.listaSeres.get(indexAnimal) instanceof Animal) {
            Animal esteAnimal = (Animal) this.listaSeres.get(indexAnimal);
            System.out.println("O " + esteAnimal.especie + " faz " + esteAnimal.getBarulhoAnimal());

        }
    }

    public void animalMovimenta(int indexAnimal) {

        System.out.println("O " + this.listaSeres.get(indexAnimal).especie + " movimentou-se!");

    }

}