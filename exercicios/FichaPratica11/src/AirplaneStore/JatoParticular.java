package AirplaneStore;

import java.util.ArrayList;

public class JatoParticular extends Aviao {
    private int lotacao;
    private double capacidadeBag;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> instalacoes;


    public JatoParticular(String numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velocidadeMax, double preco, int lotacao, double capacidadeBag, CategoriaJato categoria) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, altCauda, numMotores, autonomia, velocidadeMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBag = capacidadeBag;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<Instalacao>();
    }

    public void addInstalacao(Instalacao instacacaoNova) {
        this.instalacoes.add(instacacaoNova);
    }


}
