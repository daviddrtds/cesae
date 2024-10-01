package Ex03;

public abstract class Document {

    protected String autor;
    protected String nome;
    protected String extensao;


    public Document(String autor, String nome) {
        this.autor = autor;
        this.nome = nome;
    }

    public abstract void open();
    public abstract void save();
    public abstract void close();


}
