package Fichapratica02;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;


        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        System.out.println("Insira um número: ");
        num2 = input.nextInt();

        System.out.println("Insira um número: ");
        num3 = input.nextInt();


        if (num1 > num2 && num1 > num3 && num2 > num3) {

            System.out.println("Ordem cresecente: " + num3 + " - " + num2 + " - " + num1);

        }
        /*if (num1 > num2 && num1 > num3 && num3 > num2)*/else  {
            System.out.println("Ordem cresecente: " + num2 + " - " + num3 + " - " + num1);

        }

        if (num2 > num3 && num2 > num1 && num1 > num3) {
            System.out.println("Ordem cresecente: " + num3 + " - " + num1 + " - " + num2);

        }
        if (num2 > num3 && num2 > num1 && num3 > num1) {
            System.out.println("Ordem cresecente: " + num1 + " - " + num3 + " - " + num2);
        }


            if (num3 > num1 && num3 > num2 && num2 > num1) {
                System.out.println("Ordem cresecente: " + num1 + " - " + num2 + " - " + num3);

            }
            if (num3 > num1 && num3 > num2 && num1 > num2) {
                System.out.println("Ordem cresecente: " + num2 + " - " + num1 + " - " + num3);

            }


        }
    }





