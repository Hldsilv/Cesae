package FuncoesAux;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funcAux {
    public static void imprimirFicheiro(String path) throws FileNotFoundException {
        Scanner scannerFicheiro = new Scanner(new File(path));

        while(scannerFicheiro.hasNextLine()) {
            System.out.println(scannerFicheiro.nextLine());
        }

    }
}
