package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3, mediaA, mediaP;


        System.out.print("Introduza o número: ");
        num1 = input.nextInt();

        System.out.print("Introduza o número: ");
        num2 = input.nextInt();

        System.out.print("Introduza o número: ");
        num3 = input.nextInt();

        mediaA = (num1 + num2 + num3) / 3;

        mediaP = (num1* 0.2) + (num2 * 0.3) + (num3 * 0.5) ;

        System.out.println("A média aritmética é: " + mediaA);

        System.out.println("A média ponderada é: " + mediaP);


    }
}
