import Enums.*;

public class Main {
    public static void main(String[] args) {

        Queijo queijo1 = new Queijo("qj01", "Queijo Cabra", Medida.GRAMAS, 20,Origem.NACIONAL, TipoQueijo.CABRA);
        Carne carne1 = new Carne("crn01", "Chouriça Vinha de Alho", Medida.GRAMAS, 10, Origem.NACIONAL, TipoCarne.CHOURICO);
        Peixe peixe1 = new Peixe("px01", "Queijo Cabra", Medida.GRAMAS, 50);
        Ingrediente queijo4 = new Ingrediente("qj04", "Queijo Edam", Medida.GRAMAS, 30);

        Base base1 = new Base("bs01", "Base Alta", Medida.GRAMAS, 20, BaseEnum.MASSA_ALTA, "Crosta Alta");
        Topping topping1 = new Topping("tp01", "Topping Carne", Medida.GRAMAS, 500, Origem.NACIONAL);

        Pizza novaPizza1 = new Pizza("pzz01", "Combo Max", "Muit fixe", 19.99, Tamanho.MEDIA, base1, 100, topping1, 100);


        novaPizza1.addIngrediente(new IngredientePizza(queijo1, 100));
        novaPizza1.addIngrediente(new IngredientePizza(queijo2, 30));
        novaPizza1.addIngrediente(new IngredientePizza(queijo3, 80));
        novaPizza1.addIngrediente(new IngredientePizza(queijo4, 50));

        novaPizza1.verPizza();

    }
}
