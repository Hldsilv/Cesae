package FichaPratica06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex_07 {


    static void desenhar(String letra, int linha, int coluna) {

        for (int i = 0; i < linha; i++) {
            System.out.print(letra);

            for (int j = 1; j < coluna-1; j++) {


                if (i == 0 || i == linha-1) {

                    System.out.print(letra);
                } else {
                    System.out.print(" ");
                }


            }

            System.out.println(letra);
        }
    }


    public static void main(String[] args) {

        Scanner input   =   new Scanner(System.in);

        String car;
        int numLinhas, numColunas;

        System.out.println("Insira o caracter: ");
        car=input.next();
        System.out.println("Insira o numero de linhas: ");
        numLinhas= input.nextInt();
        System.out.println("Insira o numero de colunas: ");
        numColunas=input.nextInt();
        desenhar(car, numLinhas, numColunas);


    }

}