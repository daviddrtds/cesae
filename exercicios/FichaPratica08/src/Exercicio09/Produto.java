package Exercicio09;

public class Produto {

    private String nome;
    private double preco;
    private int stock = 0;


    public Produto(String nome, double preco, int stock) {
        this.nome = nome;
        this.preco = preco;
        this.stock = stock;
    }


    public void getStock() {
        System.out.println(this.stock);
    }

    public void setComprar(int stock) {
        this.stock += stock;
    }

    public void setVender(int stock) {
        if (this.stock < stock) {
            System.out.println("Stock insuficiente para efetuar a venda!");
        } else {
            this.stock -= stock;
        }
    }

}
