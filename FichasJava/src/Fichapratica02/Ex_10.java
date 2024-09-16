package Fichapratica02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, soma, div, sub, multi;
        String oa;

        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        System.out.print("Introduza um número: ");
        num2 = input.nextInt();

        System.out.print("Introduza a operação aritmética que deseja: ");
        oa = input.next();


        switch (oa){

            case "+": soma=num1+num2;
                System.out.println("A soma é : "+soma);
                break;
            case "-": sub=num1-num2;
                System.out.println("A subtração é : "+sub);
                break;
            case "*": multi=num1+num2;
                System.out.println("A multiplicação é : "+multi);
                break;
            case "/": div=num1/num2;
                System.out.println("A soma é : "+div);
                break;




        }






    }
}
