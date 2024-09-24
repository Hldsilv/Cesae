package Fichapratica03;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int num1,num2=0, contador=1;

        System.out.println("Introduza um número para calcular o seu factorial: ");
        num1= input.nextInt();
        num2=num1;
        while(contador<num1){
//            contador++;
            num2=num2*(num1-contador);
            contador++;



            System.out.println(num2);
        }
        System.out.println(num2);




    }
}
