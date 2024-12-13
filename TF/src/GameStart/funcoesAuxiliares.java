package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funcoesAuxiliares {

    /**
     * lê e imprime um ficheiro
     *
     * @param path caminho onde está o ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        while (scannerFicheiro.hasNextLine()) {
            System.out.println(scannerFicheiro.nextLine());
        }

        scannerFicheiro.close();
    }

    /**
     * Função para limpar a consola
     */
    public static void limparConsola() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    /**
     * Função para premir enter para continuar
     */
    public static void primaEnter() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n[Prima Enter para Continuar]");
        input.nextLine();
    }

    /**
     * conta as linhas de um ficheiro
     * @return numero de linhas do ficheiro
     * @throws FileNotFoundException
     */
    public static int contadorLinhasArray() throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/GameStart_Vendas.csv");
        Scanner sc = new Scanner(scannerFicheiro);
        int contador=0;

        while (sc.hasNextLine()){
            String linha = sc.nextLine();
            contador++;
        }
        return contador;
    }
}

