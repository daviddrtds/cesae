import Enums.Medida;
import Enums.Origem;
import Enums.TipoPeixe;

public class Peixe extends Topping {

    private TipoPeixe tipoPeixe;

    public Peixe(String codigoIngrediente, String nomeIngrediente, Medida medidaIngrediente, int caloriaPorMedida, Origem origem, TipoPeixe tipoPeixe) {
        super(codigoIngrediente, nomeIngrediente, medidaIngrediente, caloriaPorMedida, origem);
        this.tipoPeixe = tipoPeixe;
    }
}
