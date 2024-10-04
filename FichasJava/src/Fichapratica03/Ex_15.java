package Fichapratica03;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int num1,fatorial=1, contador=1;

        System.out.println("Introduza um número para calcular o seu factorial: ");
        num1= input.nextInt();


        while(contador<=num1){

            fatorial=fatorial* contador;
            contador++;

          //1  System.out.println(num2);
        }
        System.out.println(fatorial);




    }
}
