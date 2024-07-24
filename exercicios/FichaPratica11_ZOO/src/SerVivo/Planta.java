package SerVivo;

import Enums.TipoPlanta;

public class Planta extends SerVivo {


    private TipoPlanta tipoPlanta;
    private int grauDefesa;


    public Planta(String nome, String especie, String paisOrigem, int idade, TipoPlanta tipoPlanta, int grauDefesa) {
        super(nome, especie, paisOrigem, idade);
        this.tipoPlanta = tipoPlanta;
        this.grauDefesa = grauDefesa;
    }
}
