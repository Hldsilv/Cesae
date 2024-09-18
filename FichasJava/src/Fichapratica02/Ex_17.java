package Fichapratica02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        double saldoM, valorC, saldoCadames;


//        System.out.println("Introduza o valor do saldo de Janeiro: ");
//        saldoCadames= input.nextInt();
//        System.out.println("Introduza o valor do saldo de Fevereiro: ");
//        saldoCadames= saldoCadames + input.nextInt();
//        System.out.println("Introduza o valor do saldo de Março: ");
//        saldoCadames= saldoCadames + input.nextInt();
//        System.out.println("Introduza o valor do saldo de Março: ");
//        saldoCadames= saldoCadames + input.nextInt();
//
//        System.out.println(saldoCadames);
//        saldoM =  saldoCadames /12;

        System.out.println("Introduza o valor do saldo Médio");
        saldoM = input.nextInt();

        if (saldoM >= 0 && saldoM <=2000){

            System.out.println("O saldo médio é de " +saldoM + " e o valor do crédito é 0" );
        }

        if (saldoM > 2000 && saldoM <=4000){

            valorC = saldoM * 0.2;

            System.out.println("O saldo médio é de " +saldoM + " e o valor do crédito é " + valorC );
        }

        if (saldoM > 4000 && saldoM <=6000){

            valorC = saldoM * 0.3;

            System.out.println("O saldo médio é de " +saldoM + " e o valor do crédito é " + valorC );
        }

        if (saldoM > 6000){

            valorC = saldoM * 0.4;

            System.out.println("O saldo médio é de " +saldoM + " e o valor do crédito é " + valorC );
        }
    }
}