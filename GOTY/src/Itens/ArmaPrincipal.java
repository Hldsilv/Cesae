package Itens;

public class ArmaPrincipal extends ItemHeroi {
    private int ataque;
    private int ataqueEspecial;
    private boolean usouAtaqueEspecial;
    /**
     * Construtor da classe ArmaPrincipal   
     * @param nome nome da ArmaPrincipal
     * @param preco preço da ArmaPrincipal
     * @param ataque ataque da ArmaPrincipal
     * @param ataqueEspecial ataque especial da ArmaPrincipal
     */
    public ArmaPrincipal(String nome, int preco, int ataque, int ataqueEspecial) {
        super(nome, preco);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.usouAtaqueEspecial = false;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }
    /**
     * Função para saber se o heroi usou o ataque especial
     * @return true se o heroi usou o ataque especial, false caso contrário
     */
    public boolean isUsouAtaqueEspecial() {
        return usouAtaqueEspecial;
    }
    /**
     * Função para dizer se o heroi usou o ataque especial
     * @param usouAtaqueEspecial true se o heroi usou o ataque especial, false caso contrário
     */
    public void setUsouAtaqueEspecial(boolean usouAtaqueEspecial) {
        this.usouAtaqueEspecial = usouAtaqueEspecial;
    }
    /**
     * Função para resetar o ataque especial
     */
    public void resetarAtaqueEspecial() {
        this.usouAtaqueEspecial = false;
    }
    /**
     * Função para mostrar os detalhes da arma
     */
    @Override
    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.print("\tDetalhes da arma");
        System.out.print("\tAtaque: "+getAtaque());
        System.out.print("\tAtaque Especial: "+getAtaqueEspecial()+"\n");
    }

}
