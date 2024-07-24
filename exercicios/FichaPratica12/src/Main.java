import Enums.*;

public class Main {
    public static void main(String[] args) {

        Queijo queijo1 = new Queijo("qj01", "Queijo Cabra", Medida.GRAMAS, 20, Origem.NACIONAL, TipoQueijo.CABRA);

        Carne carne1 = new Carne("crn01", "Chouriça Vinha de Alho", Medida.GRAMAS, 10, Origem.NACIONAL, TipoCarne.CHOURICO);

        Peixe peixe1 = new Peixe("px01", "Atum", Medida.GRAMAS, 50, Origem.IMPORTADO, TipoPeixe.ATUM);

        Vegetal vegetal1 = new Vegetal("vg01", "Cebola Vermelha", Medida.GRAMAS, 10, Origem.NACIONAL, TipoVegetal.CEBOLA);


        Base base1 = new Base("bs01", "Base Alta", Medida.GRAMAS, 20, BaseEnum.MASSA_ALTA, "A nossa famosa base alta e fofa.");

        Topping topping1 = new Topping("tp01", "Topping Carne", Medida.GRAMAS, 500, Origem.NACIONAL);

        Pizza novaPizza1 = new Pizza("pzz01", "Combo Max", "A nossa pizza de base alta e fofa com queijo de cabra e chouriço.", 19.99, Tamanho.MEDIA, base1, 100, topping1, 100);


        novaPizza1.addIngrediente(new IngredientePizza(queijo1, 100));
        novaPizza1.addIngrediente(new IngredientePizza(vegetal1, 30));
        novaPizza1.addIngrediente(new IngredientePizza(carne1, 100));


        novaPizza1.verPizza();

    }
}
