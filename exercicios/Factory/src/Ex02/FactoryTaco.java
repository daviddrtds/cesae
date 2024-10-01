package Ex02;

public class FactoryTaco {

    public static Taco newTaco(int menu) {

        switch (menu) {

            case 1:
                return new VacaTaco();
            case 2:
                return new FrangoTaco();
            case 3:
                return new VegTaco();
            default:
                throw new IllegalArgumentException("Opção inválida");

        }

    }

}
