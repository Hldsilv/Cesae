package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ex_07 {
    public static void main(String[] args) throws FileNotFoundException {

        //Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas e o
        //número de palavras presentes nesse ficheiro.

        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_07.txt");
        Scanner sc = new Scanner(file);

        int somaPalavras=0, somaLinhas = 0;




        while (sc.hasNextLine()) {

            String linhas = sc.nextLine();
            String[] itensDaLinha= linhas.split(" ");

            somaLinhas++;
            somaPalavras+= itensDaLinha.length;

        }





        System.out.println("São "+somaLinhas+ " linhas e "+somaPalavras+" palavras");
    }
}
