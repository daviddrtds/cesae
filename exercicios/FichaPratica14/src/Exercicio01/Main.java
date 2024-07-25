package Exercicio01;

public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo("azul", 5);
        Retangulo retangulo1 = new Retangulo("roxo", 14, 8);
        Triangulo triangulo1 = new Triangulo("amarelo", 20, 30, 14, 14);


        circulo1.mostrarCor();
        System.out.println("Área: " + circulo1.calcularArea());
        System.out.println("Perímetro: " + circulo1.calcularPerimetro());

        retangulo1.mostrarCor();
        System.out.println("Área: " + retangulo1.calcularArea());
        System.out.println("Perímetro: " + retangulo1.calcularPerimetro());

        triangulo1.mostrarCor();
        System.out.println("Área: " + triangulo1.calcularArea());
        System.out.println("Perímetro: " + triangulo1.calcularPerimetro());

    }
}
