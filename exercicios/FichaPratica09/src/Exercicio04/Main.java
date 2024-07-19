package Exercicio04;

public class Main {
    public static void main(String[] args) {

        Imovel casa1 = new Imovel("fermentoes", "205", "pacos", TipoImovel.CASA, Acabamento.USADA, 80, 2, 2, 5);

        Imovel casa2 = new Imovel("reguenga", "68", "lustosa", TipoImovel.MANSAO, Acabamento.NOVA, 100, 4, 5, 20);


        System.out.println(casa1.valorImovel() + "€");

        casa1.setAcabamento(Acabamento.TOP);
        System.out.println(casa1.valorImovel() + "€");
        casa1.imprimirCasa();

        System.out.println("A casa com maior valor é:");
        casa1.compararImovel(casa2).imprimirCasa();


    }
}
