package Fichapratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, num1=1;
        String frase;

        System.out.println("Introduza um número :");
        num = input.nextInt();

        input.nextLine();
        System.out.print("Introduza uma frase :");
        frase = input.nextLine();

        while (num1 <= num){



            System.out.println(frase);
            num1= num1+1;

        }




    }
}
