package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) throws FileNotFoundException {

        //Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e
        //calcule a soma desses números.

        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_05_31.txt");
        Scanner sc = new Scanner(file);

        int soma=0;
        String linha = sc.nextLine();

        String[] itensDaLinha= linha.split(" ");

        for (int i=0; i<itensDaLinha.length; i++){
            soma+= Double.parseDouble(itensDaLinha[i]);
        }

        System.out.println("A soma é "+soma);


    }
}
