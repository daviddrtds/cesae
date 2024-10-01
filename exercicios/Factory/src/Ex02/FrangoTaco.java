package Ex02;

public class FrangoTaco extends Taco{
    @Override
    public void prepare() {
        System.out.println("...a preparar os frangos para o seu Taco");
    }

    @Override
    public void bake() {
        System.out.println("...a grelhar os seus peitos de Frango");
    }

    @Override
    public void box() {
        System.out.println("...o seu Chicken Taco está pronto!");
    }
}
