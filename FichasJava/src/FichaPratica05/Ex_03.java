package FichaPratica05;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        //Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento

Scanner input =new Scanner(System.in);
int [] array = new int [10];
        int i, maior,t=0;

    while(t<10) {
        System.out.println("Insira um número no Array:");
        array[t] = input.nextInt();
        t++;
        }

    //igualo o maior ao primeiro array e depois vou comparar
    maior=array[0];

        for(i=1; i<array.length; i++) {



        if(array[i]>maior) {
        maior= array[i];

        }
        }
        System.out.println("O maior número é: "+maior);

    }
}