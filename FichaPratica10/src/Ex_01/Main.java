package Ex_01;

public class Main {
    public static void main(String[] args) {


    Musica musica1 = new Musica("PET","Rock Alternativo","A Perfect Circle",150);
    Musica musica2 = new Musica("ola","Rock Alternativo","A Perfect Circle",150);
    Musica musica3 = new Musica("abd","Rock Alternativo","A Perfect Circle",150);
    Musica musica4 = new Musica("asdj","Rock Alternativo","A Perfect Circle",150);
    Musica musica5 = new Musica("asd","Rock Alternativo","A Perfect Circle",150);
    Musica musica6 = new Musica("Pfas","Rock Alternativo","A Perfect Circle",150);



MusicPlayer mp = new MusicPlayer();
mp.adicionarMusica(musica1);
mp.adicionarMusica(musica2);
mp.adicionarMusica(musica3);
mp.adicionarMusica(musica4);
mp.adicionarMusica(musica5);
mp.adicionarMusica(musica6);

    mp.imprimirRelatorio();


    }
}
