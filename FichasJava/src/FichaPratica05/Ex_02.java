package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        //Implemente um programa que permita adicionar comissões mensais a um array de tamanho 12 (uma posição
       // para cada mês) e calcular o seu total anual.
Scanner input = new Scanner(System.in);

int [] array  = new int [12];
int soma=0;

        System.out.println( "Insira um número no Array[0]:");
        array[0] = input.nextInt();
        array[1]= input.nextInt();
        array[2]= input.nextInt();
        array[3]= input.nextInt();
        array[4]= input.nextInt();
        array[5]= input.nextInt();
        array[6]= input.nextInt();
        array[7]= input.nextInt();
        array[8]= input.nextInt();
        array[9]= input.nextInt();
        array[10]= input.nextInt();
        array[11]= input.nextInt();
for(int i=0; i<array.length; i++) {
    soma = soma + array[i];

}
        System.out.println(soma);
    }
}
