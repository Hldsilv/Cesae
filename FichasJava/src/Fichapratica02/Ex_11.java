package Fichapratica02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int saldo, movimento, saldoAtual,m;

        System.out.println("Introduza saldo médio: ");
        saldo = input.nextInt();

        System.out.println("Introduza o valor a movimentar: ");
        movimento = input.nextInt();

        saldoAtual =  saldo + movimento;

        if (saldoAtual < 0 ) {

            System.out.println("Operação inválida. Saldo insuficiente.");
            System.out.println("Saldo atual: " +saldo);
        }

else{
    System.out.println("Saldo atual: " +saldoAtual);
        }







    }
}
