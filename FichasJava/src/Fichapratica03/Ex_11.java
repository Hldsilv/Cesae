package Fichapratica03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int valor1, valor2=0, i;

        System.out.println("Introduza um número(variável limite) maior que 0: ");
        valor1= input.nextInt();

        System.out.println("Introduza um número (salto) mairo que 0: ");
        i= input.nextInt();


        while( valor2 < valor1){

            System.out.println(valor2);
            valor2 = valor2+ i;



        }



    }
}
