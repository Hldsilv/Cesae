package GameStart;

import java.io.FileNotFoundException;

import static GameStart.Menu.menuInicial;
import static GameStart.funcoesAuxiliares.carregarPrograma;
import static GameStart.funcoesAuxiliares.imprimirFicheiro;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

    imprimirFicheiro("GameStartF/inicio.txt");
    System.out.println("\n\n\n\n");
    carregarPrograma();
    menuInicial();

    }
}
