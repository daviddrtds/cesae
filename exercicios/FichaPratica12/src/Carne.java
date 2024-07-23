import Enums.Medida;
import Enums.Origem;
import Enums.TipoCarne;

public class Carne extends Topping {

    private TipoCarne tipoCarne;

    public Carne(String codigoIngrediente, String nomeIngrediente, Medida medidaIngrediente, int caloriaPorMedida, Origem origem, TipoCarne tipoCarne) {
        super(codigoIngrediente, nomeIngrediente, medidaIngrediente, caloriaPorMedida, origem);
        this.tipoCarne = tipoCarne;
    }
}
