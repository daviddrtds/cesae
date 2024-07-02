package FichaPratica06;


public class Exercicio03 {

    /**
     * retorna par ou impar
     *
     * @param num numero inteiro
     * @return true || false
     */

    public static boolean isPair(int num) {
        return num % 2 == 0;
    }


    /**
     * retorna se o número é positivo ou negativo
     *
     * @param num numero inteiro
     * @return true||false
     */

    public static boolean isPositive(int num) {
        return num >= 0;
    }


    /**
     * retorna se o número é primo
     *
     * @param num numero inteiro
     * @return true||false
     */

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean isPerfect(int num) {

        if (num == 1) {
            return false;
        }

        int soma = 1;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                soma = soma + i;
            }
        }

        return soma == num;
    }


    public static boolean isTriangular(int num) {


        if (num < 0) {
            return false;
        }

        int count = 0;

        for (int i = 1; count < num; i++) {
            count = count + i;
        }

        return count == num;

    }


    public static void main(String[] args) {
    }
}
