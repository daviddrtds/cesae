import Enums.BaseEnum;
import Enums.Tamanho;

import java.util.ArrayList;

public class Pizza {

    private String codigoPizza;
    private String nomePizza;
    private String descricaoPizza;
    private double precoPizza;
    private Tamanho tamanhoPizza;
    private ArrayList<IngredientePizza> listaIngredientesPizza;


    public Pizza(String codigoPizza, String nomePizza, String descricaoPizza, double precoPizza, Tamanho tamanhoPizza, Base base, double quantidadeBase, Topping primeiroTopping, double quantidadeTopping) {
        this.codigoPizza = codigoPizza;
        this.nomePizza = nomePizza;
        this.descricaoPizza = descricaoPizza;
        this.precoPizza = precoPizza;
        this.tamanhoPizza = tamanhoPizza;
        this.listaIngredientesPizza = new ArrayList<IngredientePizza>();
        this.listaIngredientesPizza.add(new IngredientePizza(base, quantidadeBase));
        this.listaIngredientesPizza.add(new IngredientePizza(primeiroTopping, quantidadeTopping));

    }


    public void addIngrediente(IngredientePizza novoIngrediente) {
        if (this.listaIngredientesPizza.size() < 5) {
            this.listaIngredientesPizza.add(novoIngrediente);
            System.out.println("Ingrediente adicionado com sucesso:");
        } else {
            System.out.println("Limite máximo de 5 ingredientes.");
        }
    }


    public void removerIngrediente(String codigo) {

        for (IngredientePizza cadaIngrediente : this.listaIngredientesPizza) {
            if (cadaIngrediente.getIngrediente().getCodigoIngrediente().equals(codigo) && this.listaIngredientesPizza.indexOf(cadaIngrediente) != 0) {
                this.listaIngredientesPizza.remove(cadaIngrediente);
                return;
            }
        }
    }


    public void alterarQuantidade(IngredientePizza ingrediente, double novaQuant) {
        ingrediente.setQuantidade(novaQuant);
    }


    public double numCalorias() {

        double totalCal = 0;
        for (IngredientePizza cadaIngrediente : this.listaIngredientesPizza) {
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
        for (IngredientePizza esteIngrediente : this.listaIngredientesPizza) {
            System.out.print("Ingrediente " + count + ": Quantidade: " + esteIngrediente.getQuantidade() + " " + esteIngrediente.getIngrediente().getMedidaIngrediente() + " | ");
            esteIngrediente.verDetalhes();
            count++;

        }
    }

}
