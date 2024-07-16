package Exercicio09;

public class Main {
    public static void main(String[] args) {


        Produto novoProd1 = new Produto("cenouras", 2.99, 15);

        novoProd1.setComprar(5);
        novoProd1.getStock();
        novoProd1.setVender(2);
        novoProd1.getStock();
        novoProd1.setComprar(10);
        novoProd1.setVender(35);
        novoProd1.getStock();
    }
}
