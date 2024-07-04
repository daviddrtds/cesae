package FichaPratica06;

import java.util.Scanner;

public class Extra05 {


    public static void contarPiada(int index) {

        String[] arrPiadas = new String[]{"Que nome se dá a uma ferramenta perdida? Foice.", "O que 17 alentejanos fazem em frente ao cinema? À espera que chege mais um porque o filme é para mais de 18.", "Qual é a panela que está sempre triste? A panela depressão.", "O que acontece se o Pai Natal morrer? Ele não estará mais em trenós."};

        System.out.println(arrPiadas[index]);
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Escolha um número de 0 a 3 para ouvir uma piada: ");
        int index = input.nextInt();

        contarPiada(index);


    }
}
