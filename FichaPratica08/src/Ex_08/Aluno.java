package Ex_08;

public class Aluno {

    private String nome;
    private int idade;
    private Curso curso;
    private int media;


    public Aluno(String nome, int idade, Curso curso, int media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public String situacao() {
        if (this.media >= 9.5) {
          return "Aprovado";
        } else {
            return "Reprovado";
        }


    }
}


