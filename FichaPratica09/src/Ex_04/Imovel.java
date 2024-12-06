package Ex_04;

public class Imovel{

    private String rua;
    private int numDaPorta;
    private String cidade;
    private Tipo tipo;
    private Restauro restauro;
    private double area;
    private int numDeQuartos;
    private int numDeCasasDeBanho;
    private double areaPiscina;


    public Imovel(String rua, int numDaPorta, String cidade, Tipo tipo, Restauro restauro, double area, int numDeQuartos, int numDeCasasDeBanho, double areaPiscina) {
        this.rua = rua;
        this.numDaPorta = numDaPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.restauro = restauro;
        this.area = area;
        this.numDeQuartos = numDeQuartos;
        this.numDeCasasDeBanho = numDeCasasDeBanho;
        this.areaPiscina = areaPiscina;
    }


    public void valorImovel() {
        double precoBase=0;
        double valorQuartos=7500;
        double valorCasadeBanho =10500;
        double valorPiscina = 1000;

        switch (tipo){
            case CASA: precoBase = 1000;
            break;
            case APARTAMENTO: precoBase = 3000;
            break;
            case MANSAO: precoBase =5000;
            break;
        }

        switch (restauro){
            case PARA_RESTAURO: precoBase *= 0.5;
            break;
            case usada: precoBase *= 0.9;
            break;
            case nova: precoBase *= 1;
            break;
            case novaComAltoAcabamento: precoBase *= 1.25 ;
            break;
        }


 double valorTotal = precoBase * this.area + (numDeQuartos*valorQuartos) + (numDeCasasDeBanho*valorCasadeBanho) + (valorPiscina*areaPiscina);
        System.out.println(tipo+" tem o valor total de: " +valorTotal);
    }

    public void mudaEstado(){

    }
    public void imprimirDescricao(){
        System.out.println("O imóvel fica na rua " + this.rua+ " com o número de porta "+this.numDaPorta+" que fica na cidade "+this.cidade);
        System.out.println("O tipo do imóvel é "+ this.tipo);
        System.out.println("O tipo do restauro é "+ this.restauro);
        System.out.println("A area é "+ this.area);
        System.out.println("O número de quartos é "+ this.numDeQuartos);
        System.out.println("O número de casas de banho é: "+this.numDeCasasDeBanho);
        System.out.println("A area da piscina é "+ this.areaPiscina);
    }

    public void comparaImoveis(Imovel imovel){

    }
}
