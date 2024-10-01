package Ex03;

public class Excel extends Document {


    public Excel(String autor, String nome) {
        super(autor, nome);
        this.extensao = ".xlsx";
    }

    @Override
    public void open() {
        System.out.println("A abrir o documento Excel " + this.nome + this.extensao);
    }

    @Override
    public void save() {
        System.out.println("Alterações de " + this.autor + " gravadas");
    }

    @Override
    public void close() {
        System.out.println("A fechar o documento de " + this.extensao);
    }
}
