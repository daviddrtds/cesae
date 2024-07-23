import Enums.Medida;

public class Ingrediente {

    private String codigoIngrediente;
    private String nomeIngrediente;
    private Medida medidaIngrediente;
    private int caloriaPorMedida;


    public Ingrediente(String codigoIngrediente, String nomeIngrediente, Medida medidaIngrediente, int caloriaPorMedida) {
        this.codigoIngrediente = codigoIngrediente;
        this.nomeIngrediente = nomeIngrediente;
        this.medidaIngrediente = medidaIngrediente;
        this.caloriaPorMedida = caloriaPorMedida;
    }

    public void verDetalhesIngrediente() {
        System.out.println("Código: " + this.codigoIngrediente + " | Nome: " + this.nomeIngrediente + " | Calorias: " + this.caloriaPorMedida + "Kcal/" + this.medidaIngrediente);
    }


    //getters
    public String getCodigoIngrediente() {
        return codigoIngrediente;
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public Medida getMedidaIngrediente() {
        return medidaIngrediente;
    }

    public int getCaloriaPorMedida() {
        return caloriaPorMedida;
    }
}
