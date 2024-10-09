package FichaExtraCiclos;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int num1,soma=0 ,num2 ;

        System.out.println("Introduza um número :");
        num1=input.nextInt();

        String str =String.valueOf(num1);

        for(int i=0; i<str.length();i++){

            num2 = Character.getNumericValue(str.charAt(i));

            soma= soma+num2;

        }
        System.out.println(soma);
    }
}
