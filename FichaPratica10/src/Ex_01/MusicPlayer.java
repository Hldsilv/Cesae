package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {

    private ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<Musica>();

    }

    public void adicionarMusica(Musica novaMusica) {
        System.out.println(novaMusica.getTitulo()+" inserido com sucesso.");
        this.programacao.add(novaMusica);
    }
    public void trocarMusica(Musica trocarMusica) {
        System.out.println(" trocado com sucesso.");
        this.programacao.set(0, trocarMusica);
    }
    public void removerMusica(Musica removerMusica){
        System.out.println(removerMusica+"removido com sucesso");
        this.programacao.remove(removerMusica);
    }

    public void removerTodasAsMusicas (Musica removerTodasAsMusicas){
        System.out.println("Todas as musicas removidas com sucesso");
        this.programacao.clear();
    }
    public void imprimirRelatorio() {
//    for (int i = 0; i < this.programacao.size(); i++) {
//        this.programacao.get(i).imprimirRelatorio();
//
//    }
    for (Musica musicaAtual : this.programacao) {
        musicaAtual.imprimirRelatorio();
    }
}

    public void duracao() {


    }


}
