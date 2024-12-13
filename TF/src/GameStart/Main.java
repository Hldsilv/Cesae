package GameStart;

import java.io.FileNotFoundException;

import static GameStart.Menu.menuInicial;
import static GameStart.funcoesAuxiliares.imprimirFicheiro;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

    imprimirFicheiro("GameStartF/inicio.txt");
    menuInicial();

    }
}
