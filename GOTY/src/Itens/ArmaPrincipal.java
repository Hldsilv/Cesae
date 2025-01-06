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

    public boolean isUsouAtaqueEspecial() {
        return usouAtaqueEspecial;
    }

    public void setUsouAtaqueEspecial(boolean usouAtaqueEspecial) {
        this.usouAtaqueEspecial = usouAtaqueEspecial;
    }

    public void resetarAtaqueEspecial() {
        this.usouAtaqueEspecial = false;
    }

    @Override
    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.print("\tDetalhes da arma");
        System.out.print("\tAtaque: "+getAtaque());
        System.out.print("\tAtaque Especial: "+getAtaqueEspecial()+"\n");
    }

}
