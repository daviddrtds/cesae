import Enums.Tamanho;

import java.util.ArrayList;

public class Pizza {

    private String codigoPizza;
    private String nomePizza;
    private String descricaoPizza;
    private double precoPizza;
    private Tamanho tamanhoPizza;
    private ArrayList<IngredientePizza> ingredientesPizza;


    public Pizza(String codigoPizza, String nomePizza, String descricaoPizza, double precoPizza, Tamanho tamanhoPizza) {
        this.codigoPizza = codigoPizza;
        this.nomePizza = nomePizza;
        this.descricaoPizza = descricaoPizza;
        this.precoPizza = precoPizza;
        this.tamanhoPizza = tamanhoPizza;
        this.ingredientesPizza = new ArrayList<IngredientePizza>();
    }


    public void addIngrediente(IngredientePizza novoIngrediente) {
        if (ingredientesPizza.size() < 5) {
            this.ingredientesPizza.add(novoIngrediente);
            System.out.println("Ingrediente adicionado com sucesso:");
        } else {
            System.out.println("Limite máximo de 5 ingredientes.");
        }
    }


    public void removerIngrediente(String codigo) {

        for (IngredientePizza cadaIngrediente : this.ingredientesPizza) {
            if (cadaIngrediente.getIngrediente().getCodigoIngrediente().equals(codigo)) {
                this.ingredientesPizza.remove(cadaIngrediente);
                return;
            }
        }
    }


    public void alterarQuantidade(IngredientePizza ingrediente, double novaQuant) {
        ingrediente.setQuantidade(novaQuant);
    }


    public double numCalorias() {

        double totalCal = 0;
        for (IngredientePizza cadaIngrediente : this.ingredientesPizza) {
            totalCal = totalCal + (cadaIngrediente.getIngrediente().getCaloriaPorMedida() * cadaIngrediente.getQuantidade());
        }

        return totalCal;
    }


    public void verPizza() {
        int count = 1;
        System.out.println();
        System.out.println("----- Pizza " + this.nomePizza + " -----");
        System.out.println();
        System.out.println("Código: " + this.codigoPizza);
        System.out.println("Descrição: " + this.descricaoPizza);
        System.out.println("Preço: " + this.precoPizza + "€");
        System.out.println("Tamanho: " + this.tamanhoPizza);
        System.out.println("Total Calorias: " + numCalorias() + " Kcal");
        for (IngredientePizza esteIngrediente : this.ingredientesPizza) {
            System.out.print("Ingrediente " + count + ": Quantidade: " + esteIngrediente.getQuantidade() + " " + esteIngrediente.getIngrediente().getMedidaIngrediente() + " | ");
            esteIngrediente.verDetalhes();
            count++;

        }
    }

}
