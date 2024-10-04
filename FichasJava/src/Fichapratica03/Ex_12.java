package Fichapratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);


int valor1=0, i=0 , i1=0, i2=0, i3=0;

//        System.out.println("Introduza um número: ");
//        valor1 = input.nextInt();

while (valor1 >=0 ){


    System.out.println("Introduza um número: ");
    valor1 = input.nextInt();


    if (valor1>=0 && valor1 <=25){
        i++;


    }
    if (valor1>=26 && valor1 <=50) {
        i1++;

    }
    if (valor1>=51 && valor1 <=75) {
        i2++;

    }
    if (valor1>=76 && valor1 <=100) {
        i3++;

    }


}
        System.out.println("[00,25]: " +i+"\n[26,50]: " +i1+ "\n[51,75]: " +i2+ "\n[76,100]: " +i3  );
//while (valor2>=0 && valor2<=25){
//
//
//}

    }
}
