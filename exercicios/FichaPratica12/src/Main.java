import Enums.Medida;
import Enums.Tamanho;

public class Main {
    public static void main(String[] args) {

        Ingrediente queijo1 = new Ingrediente("qj01", "Queijo Serra", Medida.GRAMAS, 20);
        Ingrediente queijo2 = new Ingrediente("qj02", "Queijo Flamengo", Medida.GRAMAS, 10);
        Ingrediente queijo3 = new Ingrediente("qj03", "Queijo Cabra", Medida.GRAMAS, 50);
        Ingrediente queijo4 = new Ingrediente("qj04", "Queijo Edam", Medida.GRAMAS, 30);

        IngredientePizza novoQueijo4 = new IngredientePizza(queijo4, 100);
        IngredientePizza novoQueijo3 = new IngredientePizza(queijo3, 100);
        IngredientePizza novoQueijo2 = new IngredientePizza(queijo2, 50);
        IngredientePizza novoQueijo1 = new IngredientePizza(queijo1, 100);


        Pizza novaPizza1 = new Pizza("P1234", "4Queijos", "Pizza de quatro queijos", 15.99, Tamanho.MEDIA);


        novaPizza1.addIngrediente(novoQueijo1);
        novaPizza1.addIngrediente(novoQueijo2);
        novaPizza1.addIngrediente(novoQueijo3);
        novaPizza1.addIngrediente(novoQueijo4);

        novaPizza1.verPizza();

        novaPizza1.alterarQuantidade(novoQueijo4, 100);
        novaPizza1.verPizza();

    }
}
