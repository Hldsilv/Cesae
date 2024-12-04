package Ex_07;

public class Main {
    public static void main(String[] args) {


        Livro livro1 = new Livro("Silo", "Artur","Ficção",600, 1234);
        Livro livro2 = new Livro("Lord of the rings", "Sebastião","Fantasia",1200, 1235);


        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
