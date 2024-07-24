public class Inseto extends SerVivo {

    private boolean venenoso;

    public Inseto(String nome, String especie, String paisOrigem, int idade, boolean venenoso) {
        super(nome, especie, paisOrigem, idade);
        this.venenoso = venenoso;
    }


    public boolean isVenenoso() {
        return venenoso;
    }


    @Override
    public void verDetalhes() {
        super.verDetalhes();
        System.out.println("É venenoso? " + this.venenoso);
    }
}
