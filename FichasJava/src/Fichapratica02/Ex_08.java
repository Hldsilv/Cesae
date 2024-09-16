package Fichapratica02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3, mediaA, mediaP;


        System.out.print("Introduza a nota: ");
        num1 = input.nextInt();

        System.out.print("Introduza a nota: ");
        num2 = input.nextInt();

        System.out.print("Introduza a nota: ");
        num3 = input.nextInt();


        mediaP = (num1* 0.25) + (num2 * 0.35) + (num3 * 0.40) ;

        System.out.println("A média ponderada é: " + mediaP);

        if(mediaP>=9.5) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Não Aprovado");

        }

    }
}
