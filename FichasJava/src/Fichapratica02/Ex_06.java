package Fichapratica02;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Introduza um número: ");
        valor1 = input.nextInt();
        System.out.println("Introduza um número: ");
        valor2 = input.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor1 + "    " + valor2);
        }
        else {
            System.out.println(valor2 + "    " + valor1);
        }




    }
}
