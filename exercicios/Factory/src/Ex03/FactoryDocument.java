package Ex03;

public class FactoryDocument {


    public static Document newDocument(int index, String autor, String nome) {


        switch (index) {
            case 1:
                return new Doc(autor, nome);
            case 2:
                return new Excel(autor, nome);
            case 3:
                return new PPoint(autor, nome);
            default:
                throw new IllegalArgumentException("Opção inválida");
        }
    }
}

