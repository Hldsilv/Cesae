package FichaExtraCiclos;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

//        Escreva um programa que solicite ao utilizador dois números, de seguida calcule o resultado de elevar o primeiro
//        ao segundo. (Ex.: Primeiro Número: 5 | Segundo Número: 3 | Resultado (5 elevado a 3): 125).

        Scanner input = new Scanner(System.in);

        int num1, num2,elevar=1;

        System.out.println("Introduza um número: ");
        num1=input.nextInt();
        System.out.println("Introduza o segundo número: ");
        num2=input.nextInt();

        for (int i=0;i<num2;i++){

            elevar= elevar*num1;

        }
        System.out.println(elevar);

    }
}
