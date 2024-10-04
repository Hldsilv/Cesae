package Fichapratica03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double media,soma, v1 , contador=0;

        System.out.println("Introduza um número: ");
        v1= input.nextDouble();
        soma=v1;


        while(v1 != -1){

            System.out.println("Introduza um número: ");

            v1= input.nextDouble();
            soma = soma + v1; /* isto é igual a  soma+= v1;*/
            contador++;


        }

        media = (soma+1.0) / contador;
        System.out.println("A média é: " +media);

    }
}
