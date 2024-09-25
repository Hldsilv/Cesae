package FIchaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input   =   new Scanner(System.in);

        int valor1, valor2,cont=0;

        System.out.println("Introduza um valor entre 0 e 100: ");
        valor1=input.nextInt();



do {
    System.out.println("Tente adivinhar o número: ");
    valor2=input.nextInt();



        if(valor2<valor1){
            System.out.println("O número que introdoziu é inferior");

        } else if (valor2>valor1) {
            System.out.println("O número que introdoziu é superior");

        }

cont++;

    } while(valor1 != valor2);
    System.out.println("Acertaste em " +cont+ " tentativas.");


        }

    }

