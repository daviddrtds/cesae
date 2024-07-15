package Exercicio02;

public class Cao {
    private String nome;
    private String raca;
    private String latido = "au au au";

    /**
     * Método construtor para Cao
     *
     * @param raca nome da raça
     * @param nome nome do cao
     */
    public Cao(String raca, String nome) {
        this.raca = raca;
        this.nome = nome;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public void ladrar() {
        System.out.println(this.latido);
    }


}
