public class IngredientePizza {

    private Ingrediente ingrediente;
    private double quantidade;

    public IngredientePizza(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }


    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void verDetalhes() {
        this.ingrediente.verDetalhesIngrediente();
    }

}
