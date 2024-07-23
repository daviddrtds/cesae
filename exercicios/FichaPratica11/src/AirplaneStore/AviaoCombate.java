package AirplaneStore;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {

    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    public AviaoCombate(String numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velocidadeMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, altCauda, numMotores, autonomia, velocidadeMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<Arma>();
    }

    public void addArma(Arma novaArma) {
        if (arsenal.size() < 3) {
            this.arsenal.add(novaArma);
        }
    }

    public void removeArma(Arma removeArma) {
        this.arsenal.remove(removeArma);
    }


}
