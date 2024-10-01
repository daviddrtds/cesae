package Ex01;

public class ProductFactory {


    public static Product createProduct(String tipo, String name, double price){
        switch (tipo){
            case "book":return new Book(name,price);
            case "eletronics": return new Eletronics(name, price);
            case "clothing": return new Clothing(name, price);
            default: throw new IllegalArgumentException("Tipo de Produto inválido: "+tipo);
        }
    }
}
