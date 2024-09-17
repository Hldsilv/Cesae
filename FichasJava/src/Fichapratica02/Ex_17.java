package Fichapratica02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        int num,aux;
        Scanner input= new Scanner(System.in);
        num= input.nextInt();
        aux=num/200;
        num=num%200;
        System.out.println(aux+"\t"+num);
    }
}
