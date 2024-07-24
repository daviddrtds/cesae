package SerVivo;

public class Inseto extends SerVivo {

    private boolean venenoso;

    public Inseto(String nome, String especie, String paisOrigem, int idade, boolean venenoso) {
        super(nome, especie, paisOrigem, idade);
        this.venenoso = venenoso;
    }
}
