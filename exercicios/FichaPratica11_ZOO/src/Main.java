import Enums.DietaAnimal;
import Enums.TipoPlanta;

public class Main {
    public static void main(String[] args) {


        Animal bufalo1 = new Animal("Bufalo1", "Bufalo", "Africa", 35, true, 200, 20, DietaAnimal.HERBIVORO, "hummm");
        Planta palmeira1 = new Planta("Palmeira1", "Palmeira", "Africa", 50, TipoPlanta.ARVORE, 4);

        Planta sarracenia1 = new Planta("Sarracenia1", "Sarracenia", "Africa", 2, TipoPlanta.COME_INSETOS, 2);

        Inseto mosquito1 = new Inseto("Mosquito1", "Mosquito", "Africa", 1, false);


        MeioAmbiente savana = new MeioAmbiente("Savana", 50000);

        savana.addSerVivo(bufalo1);
        savana.addSerVivo(palmeira1);
        savana.addSerVivo(mosquito1);
        savana.addSerVivo(sarracenia1);
        savana.verMeio();

        savana.plantaBebe(1);
        savana.plantaComeInseto(3);
        savana.plantaAbanaComVento(3);
        savana.verMeio();
        savana.animalFazBarulho(0);
        savana.animalMovimenta(0);
    }
}
