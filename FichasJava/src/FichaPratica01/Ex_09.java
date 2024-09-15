package FichaPratica01;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double vencbase = 40 , subali = 5, retirs = 0.10;
        double segsoc_f, segsoc_e, valori, totalsub, cf, diasmes, valorRirs, valorL;

        System.out.print("Introduza o código de funcionário: ");
        cf = input.nextInt();

        System.out.print("Introduza o número total de dias que trabalhou: ");
        diasmes = input.nextInt();

        valori = (vencbase + subali) * diasmes;
        System.out.println("O valor íliquido é de: " +valori + "€");

        totalsub = subali * diasmes;
        System.out.println("O valor total do subsídio de refeição é de: " +totalsub + "€");

        valorRirs = valori * retirs;
        System.out.println("O valor da retenção de IRS a entregar ao estado é de: " +valorRirs + "€");

        segsoc_f = valori * 0.11;
        System.out.println("O valor a entregar da segurança social pelo funcionário é de: " +segsoc_f + "€");

        segsoc_e = valori * 0.2375;
        System.out.println("O valor a entregar da segurança social pelo empregador é de: " +segsoc_e + "€");

        valorL = valori - segsoc_f - valorRirs;
        System.out.println("O valor líquido a receber é de : " +valorL + "€");


    }
}
