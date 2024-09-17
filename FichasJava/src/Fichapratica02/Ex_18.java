package Fichapratica02;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double vencbaseE = 40 , vencbaseC = 60, vencbaseA = 80, subaliE = 5, subaliCeA = 7.5; /*retirs = 0.10;*/
        double segsoc_f, segsoc_e, valori, totalsub, cf, diasmes, valorRirs=0, valorL;
        String cargo;

        System.out.print("Introduza o código de funcionário: ");
        cf = input.nextInt();

        System.out.print("Introduza o seu cargo: ");
        cargo = input.next();

        System.out.print("Introduza o número total de dias que trabalhou: ");
        diasmes = input.nextInt();

        if( cargo.equals("E")) {
            valori = (vencbaseE + subaliE) * diasmes;
            System.out.println("O valor íliquido é de: " + valori + "€");

            totalsub = subaliE * diasmes;
            System.out.println("O valor total do subsídio de refeição é de: " + totalsub + "€");

            if (valori < 1000) {
                valorRirs = valori * 0.10;
                System.out.println("O valor da retenção de IRS a entregar ao estado é de: " + valorRirs + "€");
            }
            if (valori > 1000) {
                valorRirs = valori * 0.20;
                System.out.println("O valor da retenção de IRS a entregar ao estado é de: " + valorRirs + "€");

            }

            segsoc_f = valori * 0.11;
            System.out.println("O valor a entregar da segurança social pelo funcionário é de: " + segsoc_f + "€");

            segsoc_e = valori * 0.2375;
            System.out.println("O valor a entregar da segurança social pelo empregador é de: " + segsoc_e + "€");

            valorL = valori - segsoc_f - valorRirs;
            System.out.println("O valor líquido a receber é de : " + valorL + "€");
        }

        if( cargo.equals("C")) {
            valori = (vencbaseC + subaliCeA) * diasmes;
            System.out.println("O valor íliquido é de: " + valori + "€");

            totalsub = subaliCeA * diasmes;
            System.out.println("O valor total do subsídio de refeição é de: " + totalsub + "€");

            if (valori < 1000) {
                valorRirs = valori * 0.10;
                System.out.println("O valor da retenção de IRS a entregar ao estado é de: " + valorRirs + "€");
            }
            if (valori > 1000) {
                valorRirs = valori * 0.20;
                System.out.println("O valor da retenção de IRS a entregar ao estado é de: " + valorRirs + "€");

            }

            segsoc_f = valori * 0.11;
            System.out.println("O valor a entregar da segurança social pelo funcionário é de: " + segsoc_f + "€");

            segsoc_e = valori * 0.2375;
            System.out.println("O valor a entregar da segurança social pelo empregador é de: " + segsoc_e + "€");

            valorL = valori - segsoc_f - valorRirs;
            System.out.println("O valor líquido a receber é de : " + valorL + "€");
        }

        if( cargo.equals("A")) {
            valori = (vencbaseA + subaliCeA) * diasmes;
            System.out.println("O valor íliquido é de: " + valori + "€");

            totalsub = subaliCeA * diasmes;
            System.out.println("O valor total do subsídio de refeição é de: " + totalsub + "€");

            if (valori < 1000) {
                valorRirs = valori * 0.10;
                System.out.println("O valor da retenção de IRS a entregar ao estado é de: " + valorRirs + "€");
            }
            if (valori > 1000) {
                valorRirs = valori * 0.20;
                System.out.println("O valor da retenção de IRS a entregar ao estado é de: " + valorRirs + "€");

            }

            segsoc_f = valori * 0.09;
            System.out.println("O valor a entregar da segurança social pelo funcionário é de: " + segsoc_f + "€");

            segsoc_e = valori * 0.21;
            System.out.println("O valor a entregar da segurança social pelo empregador é de: " + segsoc_e + "€");

            valorL = valori - segsoc_f - valorRirs;
            System.out.println("O valor líquido a receber é de : " + valorL + "€");
        }


    }
}
