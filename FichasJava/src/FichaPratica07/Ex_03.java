package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) throws FileNotFoundException {
        // Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro ficheiro.
        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_03_Alternativa01.txt");
        Scanner in= new Scanner(file);
        File file1 = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_03_A.txt");
        PrintWriter printWriter = new PrintWriter(file1);


        while(in.hasNextLine()){

            String linha = in.nextLine();
            printWriter.println (linha);
        }

        in.close();
        printWriter.close();
    }
}
