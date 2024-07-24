import Enums.DietaAnimal;
import Enums.TipoPlanta;
import SerVivo.Animal;
import SerVivo.Planta;

public class Main {
    public static void main(String[] args) {


        Animal bufalo1 = new Animal("Bufalo1", "Bufalo", "Africa", 35, true, 200, 20, DietaAnimal.HERBIVORO, "hummm");
        Planta palmeira1 = new Planta("Palmeira1", "Palmeira", "Africa", 50, TipoPlanta.ARVORE, 4);


        MeioAmbiente savana = new MeioAmbiente("Savana", 500000);

        savana.addSerVivo(bufalo1);
        savana.addSerVivo(palmeira1);
        savana.verMeio();

    }
}
