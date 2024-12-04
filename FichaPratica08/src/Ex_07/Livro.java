package Ex_07;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private int  isbn;

    Livro (String titulo,String autor, String categoria, int numPaginas, int  isbn  ){
        this.titulo= titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes(){
        System.out.print(this.titulo + " | " +this.autor + " | "+this.categoria+ " | "+this.numPaginas+" | " +this.isbn);
        System.out.println(" ");

    }


}
