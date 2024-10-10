package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        //Implemente um programa que permita adicionar comissões mensais a um array de tamanho 12 (uma posição
       // para cada mês) e calcular o seu total anual.
Scanner input = new Scanner(System.in);

int [] array  = new int [12];
int soma=0;



            for (int i =0; i<12;i++){
                    System.out.println("Insira um número no array["+i+"]");
                    array[i]=input.nextInt();

            }


for(int i=0; i< array.length; i++) {
    soma = soma + array[i];

}
        System.out.println(soma);
    }
}
