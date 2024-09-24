package Fichapratica03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        Scanner input   =   new Scanner(System.in);

        int numInsert,numAnterior,numAtual,contador=0, i=0;

        System.out.println("Quantos números deseja inserir: ");
        numInsert= input.nextInt();
        System.out.println("Introduza um número: ");
        numAnterior = input.nextInt();


while( i < numInsert-1) {

    System.out.println("Introduza um número: ");
    numAtual = input.nextInt();
    i++;

    if (numAtual>numAnterior){
    contador++;
    }

    numAnterior   = numAtual;
}
    if (contador==i) {
        System.out.println("Crescente");
    }
else{
        System.out.println("Não é crescente");
        }

    }
}
