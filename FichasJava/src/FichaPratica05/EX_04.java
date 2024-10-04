package FichaPratica05;

import java.util.Scanner;

public class EX_04 { public static void main(String[] args) {
    //Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento


    Scanner input =new Scanner(System.in);
    int [] array = new int [10];
    int i, menor,num,t=0;

    while(t<10) {
        System.out.println("Insira um número no Array:");
        array[t] = input.nextInt();
        t++;
    }
    menor=array[0];

    for(i=0; i<array.length; i++) {

        num=array[i];

        if(num<menor) {
            menor= num;
        }

    }
    System.out.println("O menor número é: "+menor);
}
}

