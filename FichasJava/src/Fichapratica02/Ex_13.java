package Fichapratica02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos;


        System.out.println("Introduza as Horas: ");
        horas =input.nextInt();

        System.out.println("Introduza os Minutos: ");
        minutos =input.nextInt();

        if (horas >= 12) {

            horas = horas - 12;
            System.out.println(+horas+":" + minutos+" PM");
        }
        else{
            System.out.println(+horas+":" + minutos+" AM");

        }


    }
}
