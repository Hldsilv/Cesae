package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, pi = 3.14, a;

        System.out.print("Introduza o raio: ");
        raio = input.nextDouble();

        a = pi * (raio * raio);

        System.out.println("A area é: " + a);

    }
}
