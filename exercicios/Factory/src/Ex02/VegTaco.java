package Ex02;

public class VegTaco extends Taco{

    @Override
    public void prepare() {
        System.out.println("...no bosque, a colher os Cogumelos para o seu Taco!");
    }

    @Override
    public void bake() {
        System.out.println("...os cogumelos, pimentos e tomate já estão na chapa!");
    }

    @Override
    public void box() {
        System.out.println("...o seu Mush Taco está pronto!");
    }

}
