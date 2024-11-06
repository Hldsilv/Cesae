package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {
    public static void main(String[] args) throws FileNotFoundException {
        //2. Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem.

        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_02.txt");
        PrintWriter printWriter = new PrintWriter(file);

        String fileContent = "Hello World";

        printWriter.println(fileContent);
        printWriter.println("Olá Mundo");


        printWriter.close();
    }
}

