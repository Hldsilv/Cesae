package Ex_01;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Helder",35, 1.85);
        Pessoa pessoa2 = new Pessoa("Naruto",22, 1.01);

        System.out.println(pessoa1.getNome()+ " tem " + pessoa1.getIdade() + " anos");
        System.out.println(pessoa2.getNome());


        pessoa1.setIdade(26);

        System.out.println(pessoa1.getNome()+ " tem " + pessoa1.getIdade() + " anos. ");
        System.out.println(pessoa1.getNome()+ " tem " + pessoa2.getIdade()+ " anos. ");
    }
}
