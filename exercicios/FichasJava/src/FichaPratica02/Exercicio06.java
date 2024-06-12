package FichaPratica02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Vamos ordenar dois números do menor para o maior!");
        System.out.print("Introduza o primeiro número:");
        int num1 = input.nextInt();
        System.out.print("Introduza o segundo número:");
        int num2 = input.nextInt();

        if (num1==num2){
            System.out.println("Os dois números são iguais! " + num1 + " = " + num2);
        } else{
            if(num1>num2){
                System.out.println(num1 + " ---> " + num2);
            } else{
                System.out.println(num2 + " ---> " + num1);
            }
        }




    }
}
