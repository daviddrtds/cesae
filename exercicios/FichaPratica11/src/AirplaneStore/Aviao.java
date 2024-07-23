package AirplaneStore;

public class Aviao {

    protected String numSerie;
    protected String modelo;
    protected int anoFabrico;
    protected double peso;
    protected double compFuselagem;
    protected double envAsas;
    protected double altCauda;
    protected int numMotores;
    protected double autonomia;
    protected double velocidadeMax;
    protected double preco;

    public Aviao(String numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velocidadeMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.compFuselagem = compFuselagem;
        this.envAsas = envAsas;
        this.altCauda = altCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velocidadeMax = velocidadeMax;
        this.preco = preco;
    }
}
