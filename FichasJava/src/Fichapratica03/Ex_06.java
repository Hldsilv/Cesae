package Fichapratica03;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int num1, num2;

        System.out.println("Introduza um número de início :");
        num1=input.nextInt();

        System.out.println("Introduza um número de fim :");
        num2= input.nextInt();


        while (num1<=num2){

            System.out.println(num1);
            num1 = num1+1;



        }



    }
}
