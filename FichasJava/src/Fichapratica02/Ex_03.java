package Fichapratica02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sal1;

        System.out.print("Introduza o salário: ");
        sal1 = input.nextInt();


        if (sal1 <= 15000) {

            sal1 = sal1 - (sal1 * 0.20);
            System.out.println("Paga taxa de 20% " + sal1 + "€");
        }

        if (sal1 >15000 && sal1 <= 20000){
            sal1 = sal1 - (sal1 * 0.30);
            System.out.println("Paga taxa de 30% " + sal1 + "€");
        }

        if (sal1 >20000 && sal1 <= 25000){
            sal1 = sal1 - (sal1 * 0.35);
            System.out.println("Paga taxa de 35% " + sal1 + "€");
        }

        if (sal1 >25000){
            sal1 = sal1 - (sal1 * 0.40);
            System.out.println("Paga taxa de 40% " + sal1 + "€");
        }

    }
}
