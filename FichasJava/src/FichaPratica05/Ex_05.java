package FichaPratica05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] array = new int[10];
        int i=0, c=0;
        double media, soma=0;

        while( i < 10) {
            System.out.println("Introduza um valor:");
            array[i] = input.nextInt();
            i++;
        }

        while(  c < array.length){
            soma = soma + array[c];
            c++;
        }
        media = soma / array.length;
        System.out.println("A média é: "+media);

    }
}
