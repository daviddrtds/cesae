package Exercicio06;

public class Main {
    public static void main(String[] args) {

        Calculadora novaCalc = new Calculadora();

        System.out.println(novaCalc.multiplicacao(2, 7));
        System.out.println(novaCalc.adicao(5, 6));
        System.out.println(novaCalc.subtracao(4, 9));
        System.out.println(novaCalc.divisao(2, 5));
    }
}
