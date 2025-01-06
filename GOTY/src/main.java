import AudioEcor.Audio;
import Entidades.Heroi;
import Jogo.Jogo;

import java.io.FileNotFoundException;

import static FuncoesAux.funcAux.carregarPrograma;

public class main {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        carregarPrograma();
        Jogo jogo = new Jogo();
        jogo.mostrarIntroducao();
        Heroi heroi = jogo.criarPersonagem();
        jogo.iniciarAventura(heroi);
    }
}

