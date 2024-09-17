package Fichapratica02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int valor1, calc;

        System.out.println("Introduza um valor");
        valor1 = input.nextInt();



        System.out.print("São necessárias ");

        calc= valor1/200;
        valor1 = valor1%200;
        if( calc > 0) {
            System.out.print(+calc + " notas de 200€ ");
        }

        calc= valor1/100;
        valor1 = valor1%100;
        if( calc > 0) {
            System.out.print(calc + " notas de 100€ ");
        }

        calc= valor1/50;
        valor1 = valor1%50;
        if( calc > 0) {
            System.out.print(calc + " notas de 50€ ");
            //System.out.println(+valor1);
        }

        calc= valor1/20;
        valor1 = valor1%20;
        if( calc > 0) {
            System.out.print(calc + " notas de 20€ ");
        }

        calc= valor1/10;
        valor1 = valor1%10;
        if( calc > 0) {
            System.out.print(calc + " notas de 10€ ");
        }

        calc= valor1/5;
        valor1 = valor1%5;

        if( calc > 0) {
            System.out.print(calc+ " notas de 5€ ");
        }












//        if (valor1 >=100 && valor1 < 200 ){
//
//        }


    }
}
