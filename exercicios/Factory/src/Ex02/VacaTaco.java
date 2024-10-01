package Ex02;

public class VacaTaco extends Taco {



    @Override
    public void prepare() {
        System.out.println("...a preparar os ingredientes do taco de Beef");
    }

    @Override
    public void bake() {
        System.out.println("...a grelhar a sua carne de vaca");
    }

    @Override
    public void box() {
        System.out.println("...o seu Beef Taco está pronto!");
    }
}
