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


    public void setAcabamento(Acabamento acabamento) {
        this.acabamento = acabamento;
    }

    public void imprimirCasa() {
        System.out.println("Imóvel");
        System.out.println("Rua: " + this.rua);
        System.out.println("Nº Porta: " + this.numPorta);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Tipo de Imóvel: " + this.tipo);
        System.out.println("Estado: " + this.acabamento);
        System.out.println("Área total: " + this.area + "m2");
        System.out.println("Nº Quartos: " + this.quartos);
        System.out.println("Nº Casas de Banho:" + this.casaBanho);
        System.out.println("Área da piscina: " + this.areaPiscina + "m2");
    }

    public double valorImovel() {

        double valor = 0;
        int totalQuartos = 0;
        int totalCasaBanho = 0;

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


        for (int i = 0; i < this.quartos; i++) {
            totalQuartos = totalQuartos + 7500;
        }

        for (int i = 0; i < this.casaBanho; i++) {
            totalCasaBanho = totalCasaBanho + 10500;
        }


        valor = valor + totalQuartos + totalCasaBanho;
        valor = valor + (this.areaPiscina * 1000);


        switch (acabamento) {

            case Acabamento.RESTAURO:
                valor *= 0.5;
                break;

            case Acabamento.USADA:
                valor *= 0.9;
                break;

            case Acabamento.NOVA:
                break;

            case Acabamento.TOP:
                valor = valor + (valor * 0.25);
                break;
        }

        return valor;
    }


    public Imovel compararImovel(Imovel outraCasa) {

        if (this.valorImovel() > outraCasa.valorImovel()) {
            return this;
        }
        return outraCasa;
    }

}
