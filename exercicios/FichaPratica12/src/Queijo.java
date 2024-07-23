import Enums.Medida;
import Enums.Origem;
import Enums.TipoQueijo;

public class Queijo extends Topping {

    private TipoQueijo tipoQueijo;

    public Queijo(String codigoIngrediente, String nomeIngrediente, Medida medidaIngrediente, int caloriaPorMedida, Origem origem, TipoQueijo tipoQueijo) {
        super(codigoIngrediente, nomeIngrediente, medidaIngrediente, caloriaPorMedida, origem);
        this.tipoQueijo = tipoQueijo;
    }
}
