package SerVivo;

public class SerVivo {

    protected String nome;
    protected String especie;
    protected String paisOrigem;
    protected int idade;


    public SerVivo(String nome, String especie, String paisOrigem, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.idade = idade;
    }



    public void verDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Especie: " + this.especie);
        System.out.println("Origem: " + this.paisOrigem);
        System.out.println("Idade: " + this.idade);
    }



    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public int getIdade() {
        return idade;
    }
}
