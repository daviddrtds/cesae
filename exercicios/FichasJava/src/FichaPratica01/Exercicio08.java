package FichaPratica01;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int music1Mins, music1Secs, music2Mins, music2Secs, music3Mins, music3Secs,
                music4Mins, music4Secs, music5Mins, music5Secs, totalMins, totalSecs, total;

        System.out.print("Introduza os minutos da música 1:");
        music1Mins = input.nextInt();
        System.out.print("Introduza os segundos da música 1:");
        music1Secs = input.nextInt();

        System.out.print("Introduza os minutos da música 2:");
        music2Mins = input.nextInt();
        System.out.print("Introduza os segundos da música 2:");
        music2Secs = input.nextInt();

        System.out.print("Introduza os minutos da música 3:");
        music3Mins = input.nextInt();
        System.out.print("Introduza os segundos da música 3:");
        music3Secs = input.nextInt();

        System.out.print("Introduza os minutos da música 4:");
        music4Mins = input.nextInt();
        System.out.print("Introduza os segundos da música 4:");
        music4Secs = input.nextInt();

        System.out.print("Introduza os minutos da música 5:");
        music5Mins = input.nextInt();
        System.out.print("Introduza os segundos da música 5:");
        music5Secs = input.nextInt();

        totalMins = (music1Mins + music2Mins + music3Mins + music4Mins + music5Mins) * 60;

        totalSecs = music1Secs + music2Secs + music3Secs + music4Secs + music5Secs;

        total = totalMins + totalSecs;


        System.out.println("Total de segundos: " + total);

        int secs = total % 60;
        int horas = total / 60;
        int minutes = horas % 60;
        horas = horas / 60;


        System.out.println("Total do álbum: " + horas +"h " + minutes +"m " + secs + "s");
        

    }
}
