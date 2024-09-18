package Fichapratica03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1=0, numL;

        System.out.println("Introduza um número: ");
        numL = input.nextInt();

        while ( num1 <= numL){

            System.out.println(num1);
            num1= num1+1;
        }



    }
}
