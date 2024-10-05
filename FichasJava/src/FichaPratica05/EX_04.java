package FichaPratica05;

import java.util.Scanner;

public class EX_04 { public static void main(String[] args) {
    //Escreva um programa que lê um array de tamanho 10 e encontra o menor elemento


    Scanner input =new Scanner(System.in);
    int [] array = new int [10];
    int i,menor,t;

    for(t=0; t<10;t++) {
        System.out.println("Insira um número no Array:");
        array[t] = input.nextInt();
    }
    menor=array[0];

    for(i=1; i<array.length; i++) {



        if(array[i]<menor) {
            menor= array[i];
        }

    }
    System.out.println("O menor número é: "+menor);
    }
}

