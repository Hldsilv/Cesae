package Fichapratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input   =   new Scanner(System.in);


        int valori, valorf;

        System.out.println("Introduza um número : ");
        valori = input.nextInt();


        System.out.println("Introduza um número : ");
        valorf = input.nextInt();


while (valori % 5 != 0) {
    valori++;
//    System.out.println(valori);
}
while   (valori <= valorf) {
    System.out.println(valori);
    valori= valori + 5;


        }

    }


}

