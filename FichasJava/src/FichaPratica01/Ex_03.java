package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int area, perimetro, c, l;

        System.out.print("Introduza o cumprimento: ");
        c = input.nextInt();

        System.out.print("Introduza a largura: ");
        l = input.nextInt();

        area = c * l;
        perimetro = c + c + l + l;

        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " + perimetro);





    }
}
