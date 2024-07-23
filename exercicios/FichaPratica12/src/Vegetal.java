import Enums.Medida;
import Enums.Origem;
import Enums.TipoVegetal;

public class Vegetal extends Topping {

    private TipoVegetal tipoVegetal;

    public Vegetal(String codigoIngrediente, String nomeIngrediente, Medida medidaIngrediente, int caloriaPorMedida, Origem origem, TipoVegetal tipoVegetal) {
        super(codigoIngrediente, nomeIngrediente, medidaIngrediente, caloriaPorMedida, origem);
        this.tipoVegetal = tipoVegetal;
    }
}
