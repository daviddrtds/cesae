package Ex01;

public class Book extends Product{


    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("--- name: " + this.name +", "+ this.price);
    }
}
