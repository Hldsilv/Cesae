package Fichapratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, resto;

        System.out.println("Introduza um número: ");
        valor1 = input.nextInt();

        if (valor1 % 2 == 0){
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é impar");
        }

    }
}
