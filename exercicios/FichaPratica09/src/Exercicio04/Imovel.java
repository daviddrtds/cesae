package Exercicio04;

public class Imovel {

    private String rua;
    private String numPorta;
    private String cidade;
    private TipoImovel tipo;
    private Acabamento acabamento;
    private double area;
    private int quartos;
    private int casaBanho;
    private double areaPiscina;


    public Imovel(String rua, String numPorta, String cidade, TipoImovel tipo, Acabamento acabamento, double area, int quartos, int casaBanho, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.area = area;
        this.quartos = quartos;
        this.casaBanho = casaBanho;
        this.areaPiscina = areaPiscina;
    }


    public double valorImovel() {

        double valor = 0;

        switch (tipo) {

            case TipoImovel.APARTAMENTO:
                valor = this.area * 1000;
                break;

            case TipoImovel.CASA:
                valor = this.area * 3000;
                break;

            case TipoImovel.MANSAO:
                valor = this.area * 5000;
                break;
        }


        switch (acabamento) {

            case Acabamento.RESTAURO:
                break;

            case Acabamento.USADA:
                break;

            case Acabamento.NOVA:
                break;

            case Acabamento.TOP:
                break;
        }

    }

}
