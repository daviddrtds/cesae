import Enums.TipoPlanta;

public class Planta extends SerVivo {


    private TipoPlanta tipoPlanta;
    private int grauDefesa;


    public Planta(String nome, String especie, String paisOrigem, int idade, TipoPlanta tipoPlanta, int grauDefesa) {
        super(nome, especie, paisOrigem, idade);
        this.tipoPlanta = tipoPlanta;
        this.grauDefesa = grauDefesa;
    }


    @Override
    public void verDetalhes() {
        super.verDetalhes();
        System.out.println("Tipo de planta: " + this.tipoPlanta);
        System.out.println("Grau de defesa: " + this.grauDefesa +"/5");

    }

    public TipoPlanta getTipoPlanta() {
        return tipoPlanta;
    }

    public int getGrauDefesa() {
        return grauDefesa;
    }
}
