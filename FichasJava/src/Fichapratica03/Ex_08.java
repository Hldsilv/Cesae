package Fichapratica03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, inicio,fim;

        System.out.println("Introduza um número :");
        valor1 = input.nextInt();

        inicio = valor1-5;
        fim = valor1+5;




        while (inicio<valor1){

            System.out.println(inicio);
            inicio++;

        }
        inicio = valor1 +1;
        while (inicio<=fim){

            System.out.println(inicio);
            inicio++;


        }



    }
}
