package Exercicio02;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta("ze", 4444, 500);
        Conta conta2 = new Conta("carlos", 2222, 1500);
        Conta conta3 = new Conta("miguel", 3333, 200);

        conta1.depositarValor(1000);
        conta1.mostrarSaldo();
        conta1.levantarValor(120);
        conta1.mostrarSaldo();

        conta1.transferencia(80, conta3);
        conta1.mostrarSaldo();
        conta3.mostrarSaldo();

    }
}
