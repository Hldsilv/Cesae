package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) throws FileNotFoundException {
        //Escreva um programa que leia um ficheiro CSV (Comma-Separated Values) e imprima o conteúdo na
        //consola.
        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_04.csv");
        Scanner sc = new Scanner(file);


        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            System.out.println(linha);
        }

    }
}
