package Exercicio03;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo(10, 20);
        Retangulo terreno = new Retangulo(100, 50);

        System.out.println("Perímetro: " + retangulo1.perimetro());
        System.out.println("Área: " + retangulo1.area());
    }
}
