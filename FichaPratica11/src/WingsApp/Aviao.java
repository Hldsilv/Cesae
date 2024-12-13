package WingsApp;

public class Aviao {
    private int numSerie;
    private String modelo;
    private int anoFabrico;
    private double pesoKg;
    private double compFuselagem;
    private double enAsas;
    private double altCauda;
    private int numMotores;
    private double autonomia;
    private double velMax;
    private double preco;

    public Aviao(int numSerie, String modelo, int anoFabrico, double pesoKg, double compFuselagem, double enAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.pesoKg = pesoKg;
        this.compFuselagem = compFuselagem;
        this.enAsas = enAsas;
        this.altCauda = altCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }
}

