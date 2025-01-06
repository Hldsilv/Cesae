package FuncoesAux;

import AudioEcor.Cor;
import Entidades.Heroi;
import Entidades.NPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class funcAux {
    /**
     * Função para imprimir o conteúdo de um ficheiro
     * @param path caminho do ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static void imprimirFicheiro(String path) throws FileNotFoundException {
        Scanner scannerFicheiro = new Scanner(new File(path));

        while(scannerFicheiro.hasNextLine()) {
            System.out.println(scannerFicheiro.nextLine());
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
     * Função para limpar a consola
     */
    public static void limparConsola() {
        for(int i = 0; i < 100; ++i) {
            System.out.println();
        }
    }
    /**
     * Mostra a vida do heroi e do npc durante o combate
     * @param heroi recebe o heroi que esta em combate
     * @param npc recebe o npc que esta em combate
     */
    public static void mostrarDetalhesCombate(Heroi heroi, NPC npc) {
        System.out.println("====== Estado do Heroi ======");
        heroi.mostrarDetalhes();
        System.out.println("\n====== Inimigo ======");
        npc.mostrarDetalhes();
        System.out.println("======================");
    }
    /**
     * Animação a carregar o programa, delay a aparecer o texto e os pontos finais.
     * @throws InterruptedException Caso entre em espera
     */
    public static void carregarPrograma() throws InterruptedException, FileNotFoundException {
        imprimirFicheiro("Ficheiros/ascii/inicio.txt");

        sleep(2000);
        System.out.print("\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\tO JOGO ESTÁ A INICIAR");
        sleep(2000);

        for (int i = 0; i < 5; i++) {
            sleep(700);
            System.out.print(".");
        }
        System.out.println("\n\n\n\n\n");
        primaEnter();
    }
    /**
     * Animação ao fechar o programa
     * @throws InterruptedException caso entre em espera
     */
    public static void fecharProgramaAnimacao() throws InterruptedException {

        sleep(500);
        System.out.println("\n\n\n\n***********************************************************************\n");
        sleep(500);
        System.out.print("\t\t\t\t\t\tA FECHAR O JOGO");
        sleep(1000);

        for (int i = 0; i < 5; i++) {
            sleep(900);
            System.out.print(".");
        }
        sleep(500);
        System.out.println("\n\n***********************************************************************\n");
        sleep(2000);
    }

    //*
    // Função para encerrar o programa
    public static void encerrarPrograma() throws InterruptedException, FileNotFoundException {
        fecharProgramaAnimacao();
        System.out.print("\n\n\n");
        imprimirFicheiro("Ficheiros/ascii/copyright.txt");
        System.out.println("\n\n\t\t\t\t\t\tObrigado e até à próxima \uD83D\uDE01");
    }
}
