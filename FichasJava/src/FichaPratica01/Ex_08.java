package FichaPratica01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        double horas,  minutos, segundos;
        int min1, min2, min3, min4, min5, seg1, seg2, seg3, seg4, seg5 ;
       int minutosf=1, horasf=1, segundosf=1;

        System.out.println("Introduza minutos da música 1: ");
        min1 = input.nextInt();
        System.out.println("Introduza segundos da música 1: ");
        seg1 = input.nextInt();
        System.out.println("Introduza minutos da música 2: ");
        min2 = input.nextInt();
        System.out.println("Introduza segundos da música 2: ");
        seg2 = input.nextInt();
        System.out.println("Introduza minutos da música 3: ");
        min3 = input.nextInt();
        System.out.println("Introduza segundos da música 3: ");
        seg3 = input.nextInt();
        System.out.println("Introduza minutos da música 4: ");
        min4 = input.nextInt();
        System.out.println("Introduza segundos da música 4: ");
        seg4 = input.nextInt();
        System.out.println("Introduza minutos da música 5: ");
        min5 = input.nextInt();
        System.out.println("Introduza segundos da música 5: ");
        seg5 = input.nextInt();

        /* total dos segundos + segundos para minutos*/
        segundos = seg1+ seg2 + seg3+ seg4+ seg5;
        segundos = segundos / 60;
//        System.out.println("seg" + segundos);

        /* total dos minutos + minutos para horas*/
        minutos = min1 + min2 + min3+ min4 + min5 + segundos;
//        System.out.println("min" + minutos);

        /* retirar o numero inteiro (para passar o numero inteiro para os minutos e poder converter os decimais em segundos)*/
        segundos = segundos - (int)segundos;
//        System.out.println("seg" + segundos);

        /*converter os decimais em segundos*/
        segundos = segundos * 60;
//        System.out.println("seg" + segundos);

        /*converter os decimais em segundos*/
        segundos = (int)segundos;
//        System.out.println("seg" + segundos);
//        System.out.println("minutos" + minutos);

/*buscar apenas o inteiro que é o numero de horas*/
        horas= minutos / 60;
        horasf = (int) horas;
//        System.out.println("horas" + horasf);

/* passar o decimal para minutos*/
        horas= horas - (int)horas;
//        System.out.println("horas" + horas);

        /*passar horas para minutos*/
        minutos = (int) (horas * 60);
//        System.out.println("minutos" + minutos);

        /* passagem de double para int*/
        minutosf = (int) minutos;
        segundosf = (int) segundos;
//        System.out.println("minutos" + minutos);

        System.out.println("Total do album: " + horasf+"h " +minutosf+"m " + segundosf+"s" );




    }

}
