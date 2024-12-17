package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

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
     *
     * @return numero de linhas do ficheiro
     * @throws FileNotFoundException
     */
    public static int contarLinhasFicheiro() throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/GameStart_Vendas.csv");
        Scanner sc = new Scanner(scannerFicheiro);
        int contador = 0;

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            contador++;
        }
        return contador;
    }

    /**
     * Importa o ficheiro de vendas.csv
     *
     * @return scanner
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static Scanner importarFicheiro() throws FileNotFoundException {
        return new Scanner(new File("GameStartF/Gamestart_Vendas.csv"));

    }

    /**
     * Animação a carregar o programa, delay a aparecer o texto e os pontos finais.
     * @throws InterruptedException Caso entre em espera
     */
    public static void carregarPrograma() throws InterruptedException {

        sleep(2000);
        System.out.print("\t\t\t\t\t\t\tO PROGRAMA ESTÁ A INICIAR");
        sleep(2000);

        for (int i = 0; i < 5; i++) {
            sleep(700);
            System.out.print(".");
        }
    }

    /**
     * Animação ao fechar o programa
     * @throws InterruptedException caso entre em espera
     */
    public static void fecharPrograma() throws InterruptedException {

        sleep(500);
        System.out.print("\t\t\t\t\tA FECHAR O PROGRAMA");
        sleep(1000);


        for (int i = 0; i < 5; i++) {
            sleep(900);
            System.out.print(".");
        }
        sleep(500);
        System.out.println("\n\n***************************************************************\n");
        sleep(2000);
    }

    /**
     * Mostra ao user que a opção selecionada é inválida
     */
    public static void opcaoInvalida() {
        System.out.println("\n*********************** Opção Inválida ***********************\n");
        primaEnter();
    }

    /**
     * imprime um ficheiro
     * @param nomeCabecalho recebe o nome do ficheiro para imprimir
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void imprimirHeader(String nomeCabecalho) throws FileNotFoundException {
        imprimirFicheiro("GameStartF/cabecalhos/"+nomeCabecalho);
    }
}

