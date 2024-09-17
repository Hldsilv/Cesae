package Fichapratica02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        String letra;

        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        System.out.println("Insira um número: ");
        num2 = input.nextInt();

        System.out.println("Insira um número: ");
        num3 = input.nextInt();

        System.out.println("Se quiser os números por ordem crescente digite C, se quiser os números por ordem decrescente digite D ");
        letra = input.next();

        if (letra.equals("C")) {
            if (num1 > num2 && num1 > num3 && num2 > num3) {

                System.out.println("Ordem cresecente: " + num3 + " - " + num2 + " - " + num1);

            }
            if (num1 > num2 && num1 > num3 && num3 > num2) {
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


        //decrescente

        if (letra.equals("D")) {
            if (num1 < num2 && num1 < num3 && num2 < num3) {

                System.out.println("Ordem decresecente: " + num3 + " - " + num2 + " - " + num1);

            }
            if (num1 < num2 && num1 < num3 && num3 < num2) {
                {
                    System.out.println("Ordem decresecente: " + num2 + " - " + num3 + " - " + num1);

                }

                if (num2 < num3 && num2 < num1 && num1 < num3) {
                    System.out.println("Ordem decresecente: " + num3 + " - " + num1 + " - " + num2);

                }
                if (num2 < num3 && num2 < num1 && num3 < num1) {
                    System.out.println("Ordem decresecente: " + num1 + " - " + num3 + " - " + num2);
                }


                if (num3 < num1 && num3 < num2 && num2 < num1) {
                    System.out.println("Ordem decresecente: " + num1 + " - " + num2 + " - " + num3);

                }
                if (num3 < num1 && num3 < num2 && num1 < num2) {
                    System.out.println("Ordem decresecente: " + num2 + " - " + num1 + " - " + num3);

                }
            }


        }
    }
}
