package Ex_01;

public class Carro {

    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potenciaCv;
    private int cc;
    private TipoCombustivel combustivel;
    private double consumoL100Km;

    public Carro(String marca, String modelo, int anoFabrico, int potenciaCv, int cc, TipoCombustivel combustivel, double consumoL100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potenciaCv = potenciaCv;
        this.cc = cc;
        this.combustivel = combustivel;
        this.consumoL100Km = consumoL100Km;
    }

    /**
     * Retorna a idade atual do carro
     *
     * @return Idade Atual
     */
    public int idade() {
        return 2024 - anoFabrico;
    }

    /**
     * Ligar um carro
     */
    public void ligar() {

        if (this.idade() <= 30) { // 30 anos ou mais recente

            if (this.potenciaCv < 250) { // menos de 250 cv

                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmmmmmmmm");

            } else { // tem 250 ou mais cv

                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMMMMMMMMM");
            }

        } else { // mais de 30 anos

            if (this.combustivel.equals(TipoCombustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }

        }

    }

    /**
     * Efetuar uma corrida entre dois Carros
     * @param adversario Carro advserário
     * @return Carro vencedor || null se empatou
     */
    public Carro corrida(Carro adversario) {

        if (this.potenciaCv > adversario.potenciaCv) { // ganha o meu carro por cv
            return this;
        } else if (this.potenciaCv < adversario.potenciaCv) { // ganha o adversario por cv
            return adversario;
        } else { // empate por potencia

            if (this.cc > adversario.cc) { // ganha o meu carro por cc
                return this;
            } else if (this.cc < adversario.cc) { // ganha o adversario por cc
                return adversario;
            } else { // empate de cc

                if (this.idade() < adversario.idade()) { // ganha o meu carro por idade
                    return this;
                } else if (this.idade() > adversario.idade()) { // ganha o adversario por idade
                    return adversario;
                } else { // empate - retorna nulo
                    return null;
                }

            }


        }

    }

    public void exibirDetalhes() {
        System.out.println(this.marca + " | " + this.modelo + " | " + this.anoFabrico);
    }
}
