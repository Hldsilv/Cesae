package Ex_01;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    /**
     * Construtor para Pessoa
     * @param nome Nome da Pessoa
     * @param idade Idade da Pessoa
     * @param altura Altura (m.)
     */
    Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }
    /**
     * Acesso Get a nome
     * @return nome da Pessoa
     */
    public String getNome(){
        return this.nome;
    }
    /**
     * Acesso Get a idade
     * @return Idade da Pessoa
     */
    public int getIdade(){
        return this.idade;
    }
    /**
     * Acesso Set a idade
     * @param idade Idade Nova
     */
    public void setIdade(int idade) {
        this.idade=idade;
    }
}
