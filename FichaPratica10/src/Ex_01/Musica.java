package Ex_01;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int duracao;

    public Musica(String titulo, String genero, String artista, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void imprimirRelatorio(){
        System.out.println(this.titulo + " | " +this.genero+ " | "+this.artista+ " | "+this.duracao);
    }
}
