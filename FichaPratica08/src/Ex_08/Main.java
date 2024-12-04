package Ex_08;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Vitor S.", 25, Curso.SOFTWARE_DEVELOPER, 15);
        Aluno aluno2 = new Aluno("Joaquim A.", 45, Curso.FRONT_END_DEVELOPER, 5);

        System.out.println("Situação do " + aluno1.getNome() + ": " + aluno1.situacao());
        System.out.println("Situação do " + aluno2.getNome() + ": " + aluno2.situacao());
    }
}
