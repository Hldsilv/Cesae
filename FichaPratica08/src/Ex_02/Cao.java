package Ex_02;

public class Cao {
    private String nome;
    private String raca;
    private String latido = "AU AU AU";



    /**
     * Construtor para Cão
     * @param nome Nome do cão
     * @param raca raça do cão
     */
    Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;

    }


    public void ladrar() {
       System.out.println(this.latido);

    }

    /**
     * Acesso Get a nome
     * @return nome do cão
     */
    public String getNome(){
        return this.nome;
    }
    /**
     * Acesso Get a raça
     * @return raça do cão
     */
    public String getRaca(){
        return this.raca;
    }
    /**
     * Acesso get a latido
     * @return latido do cao
     */
    public String getLatido() {
        return this.latido ;
    }
    /**
     * Acesso Set a latido
     * @param latido latido Novo
     */
    public void setLatido(String latido) {
        this.latido = latido;
    }


}