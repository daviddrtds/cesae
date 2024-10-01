package Ex03;

public class PPoint extends Document{

    public PPoint(String autor, String nome) {
        super(autor, nome);
        this.extensao = ".pptx";
    }

    @Override
    public void open() {
        System.out.println("A abrir o documento PowerPoint " + this.nome + this.extensao);
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
