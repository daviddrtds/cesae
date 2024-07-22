package Exercicio03;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome;
    private String cor;
    private String anoFabrico;
    private int tripulacao;
    private double capacidadeKg;
    private MarcaBarco marca;
    private ArrayList<Peixe> listaPeixes;
    private ArrayList<Marisco> listaMariscos;


    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeKg, MarcaBarco marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeKg = capacidadeKg;
        this.marca = marca;
        this.listaPeixes = new ArrayList<Peixe>();
        this.listaMariscos = new ArrayList<Marisco>();
    }


    public double calcularCarga() {
        double cargaAtual = 0;

        for (Peixe estePeixe : this.listaPeixes) {
            cargaAtual += estePeixe.getPeso();
        }

        for (Marisco esteMarisco : this.listaMariscos) {
            cargaAtual += esteMarisco.getPeso();
        }
        return cargaAtual;
    }


    public void pescarPeixe(Peixe novoPeixe) {

        if (novoPeixe.getPeso() + this.calcularCarga() <= this.capacidadeKg) {
            this.listaPeixes.add(novoPeixe);
            System.out.println("Peixe pescado com sucesso!");
        } else {
            System.out.println("Demasiado peso para o barco!!!!!!");
        }
    }

    public void pescarMarisco(Marisco novoMarisco) {
        if (novoMarisco.getPeso() + this.calcularCarga() <= this.capacidadeKg) {
            this.listaMariscos.add(novoMarisco);
            System.out.println("Marisco pescado com sucesso!");
        } else {
            System.out.println("Demasiado peso para o barco!!!!!!");
        }
    }


    public void largarPeixe(int index) {
        this.listaPeixes.remove(index);
        System.out.println("Peixe removido com sucesso!");
    }


    public void largarMarisco(int index) {
        this.listaMariscos.remove(index);
        System.out.println("Marisco removido com sucesso!");

    }


    public void verDetalhes() {
        System.out.println();
        System.out.println("--- " + this.nome + " ---");
        System.out.println("Carga atual: " + this.calcularCarga() + "kg");
        System.out.println();
        System.out.println("Peixes pescados:");
        for (Peixe cadaPeixe : this.listaPeixes) {
            cadaPeixe.verDetalhesPeixe();
        }
        System.out.println();
        System.out.println("Marisco pescado:");
        for (Marisco cadaMarisco : this.listaMariscos) {
            cadaMarisco.verDetalhesMarisco();
        }
        System.out.println();
        System.out.println("Valor total da pescaria: " + this.valorTotal()+"€");
    }


    public double valorTotal() {
        double valorTotal = 0;
        for (Peixe estePeixe : this.listaPeixes) {
            valorTotal += estePeixe.getPeso() * estePeixe.getPrecoKg();
        }
        for (Marisco esteMarisco : this.listaMariscos) {
            valorTotal += esteMarisco.getPeso() * esteMarisco.getPrecoKg();
        }
        return valorTotal;
    }


}
