import Enums.Medida;
import Enums.Origem;

public class Topping extends Ingrediente {

    private Origem origem;

    public Topping(String codigoIngrediente, String nomeIngrediente, Medida medidaIngrediente, int caloriaPorMedida, Origem origem) {
        super(codigoIngrediente, nomeIngrediente, medidaIngrediente, caloriaPorMedida);
        this.origem = origem;
    }
}
