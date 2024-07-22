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


    public void pescarPeixe(Peixe novoPeixe) {
        this.listaPeixes.add(novoPeixe);
        System.out.println("Peixe pescado com sucesso!");
    }

    public void largarPeixe(int index) {
        this.listaPeixes.remove(index);
    }

    public void pescarMarisco(Marisco novoMarisco) {
        this.listaMariscos.add(novoMarisco);
        System.out.println("Marisco pescado com sucesso!");
    }

    public void largarMarisco(int index) {
        this.listaMariscos.remove(index);
    }

}
