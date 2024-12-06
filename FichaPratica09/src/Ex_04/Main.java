package Ex_04;

public class Main {
    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("praça de carvalho",215,"Lisboa",Tipo.APARTAMENTO,Restauro.nova,540,5,6,55);

        imovel1.valorImovel();
        imovel1.imprimirDescricao();
    }
}
