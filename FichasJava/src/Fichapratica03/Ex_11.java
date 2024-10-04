package Fichapratica03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int limite, contador=0, salto;

        System.out.println("Introduza um número(variável limite) maior que 0: ");
        limite= input.nextInt();

        System.out.println("Introduza um número (salto) mairo que 0: ");
        salto= input.nextInt();


        while( contador <= limite){

            System.out.println(contador);
            contador = contador+ salto;



        }



    }
}
