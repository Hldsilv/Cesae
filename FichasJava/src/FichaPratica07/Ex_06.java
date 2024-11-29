package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) throws FileNotFoundException {
       // Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e
        // imprima o nome da pessoa mais velha na consola.

        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_06.txt");
        Scanner sc = new Scanner(file);

        int maior=0, idade;
        String nomeMaisVelho = "";


        while (sc.hasNextLine()){

            String linha = sc.nextLine();
            String[] itensDaLinha= linha.split(",");

            String nome = itensDaLinha[0];
            idade = Integer.parseInt(itensDaLinha[1]);

            if (maior<idade){
                maior = idade;
                nomeMaisVelho = nome;


            }

        }

        System.out.println("A pessoa mais velha é " +nomeMaisVelho +" com " + maior+ " anos.");

    }
}
