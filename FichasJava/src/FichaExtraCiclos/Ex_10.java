package FichaExtraCiclos;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        //Escreva um programa que solicita um número inteiro ao utilizador, de seguida imprima o número com os dígitos
        //revertidos (Ex.: Número: 22456 | Resultado: 65422)


        Scanner input = new Scanner(System.in);

        int num1;
        String rev = "";
        System.out.println("Introduza um número para revertê-lo:");
        num1= input.nextInt();
        String str = String.valueOf(num1);

        int j = str.length()-1;
        for (int i=0; i<str.length(); i++){


            rev= rev + str.charAt(j);

        j--;
        }
        System.out.println(rev);



    }
}
