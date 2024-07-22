package Exercicio01;

public class Musica {

    private String titulo;
    private String genero;
    private String artista;
    private int duracao;


    public Musica(String titulo, String genero, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracaoSegundos;
    }


    public int getDuracao() {
        return duracao;
    }

    public void imprimirDetalhesMusica() {
        System.out.println(this.titulo + " | " + this.artista + " | " + this.genero + " | " + this.duracao);
    }

}
