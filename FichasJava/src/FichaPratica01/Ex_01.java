package FichaPratica01;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        //Import do Scanner - Habilitar a escrita por parte do user
        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        int num1, num2, soma;

        //Ler o num1
        System.out.print("Introduza o número: ");
        num1 = input.nextInt();

        //Ler o num2
        System.out.print("Introduza o número: ");
        num2 = input.nextInt();

        //Calcular a soma
        soma = num1 + num2;

        //Apresentar a soma
        System.out.println("Soma: " + soma);



    }


}
