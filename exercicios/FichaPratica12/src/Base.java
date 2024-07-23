import Enums.BaseEnum;
import Enums.Medida;

public class Base extends Ingrediente {

    private BaseEnum tipoBase;
    private String descricao;

    public Base(String codigoIngrediente, String nomeIngrediente, Medida medidaIngrediente, int caloriaPorMedida, BaseEnum tipoBase, String descricao) {
        super(codigoIngrediente, nomeIngrediente, medidaIngrediente, caloriaPorMedida);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}
