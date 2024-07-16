package Exercicio08;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private double media;


    /**
     * Metodo para criar classe Aluno
     *
     * @param nome  string com nome do aluno
     * @param idade integer com idade do aluno
     * @param curso string com o nome do curso
     * @param media double com o valor da media do aluno
     */
    public Aluno(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public String situacao() {
        if (this.media >= 9.5) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
