package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_01.txt");
        Scanner sc = new Scanner(file);


        System.out.println(sc.nextLine());
    }
}
