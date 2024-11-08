package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) throws FileNotFoundException {

        //Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto,
        //quantidade vendida, valor unitario) e calcule o valor total das vendas.

        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_08.csv");
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();
        double quantidade_vendida, preco_unitario, total=0;


        while(sc.hasNextLine()){
            linha = sc.nextLine();
            String[] itensDaLinha= linha.split(",");
            quantidade_vendida =Double.parseDouble(itensDaLinha[2]);
            preco_unitario = Double.parseDouble(itensDaLinha[3]);


            total +=quantidade_vendida*preco_unitario;
        }
        System.out.println("Total : " +total);
        sc.close();
    }
}
