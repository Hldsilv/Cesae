package Entidades;

public class Entidade {
    private String nome;
    private int maxHp;
    private int hp;
    private int forca;

    public Entidade(String nome, int maxHp, int hp, int forca) {
        this.nome = nome;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public int getVidaMax() {
        return maxHp;
    }

    public int getHp() {
        return hp;
    }

    public int getForca() {
        return forca;
    }
    public void receberDano(int dano) {

        this.hp -= dano;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public void curar(int pontos) {

        this.hp += pontos;
        if (this.hp > this.maxHp) {
            this.hp = this.maxHp;
        }
    }
    public boolean estaVivo() {
        return this.hp > 0;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.hp + " | " + this.maxHp);
        System.out.println("Força: " + forca);
    }

}
