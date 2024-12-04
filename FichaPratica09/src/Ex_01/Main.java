package Ex_01;

public class Main {
    public static void main(String[] args) {
        // Instanciar os carros
        Carro carro1 = new Carro("Mercedes","A45",2024,420,3500,TipoCombustivel.GASOLINA,25);
        Carro carro2 = new Carro("Fiat","Uno",1980,50,1000,TipoCombustivel.DIESEL,7);
        Carro carro3 = new Carro("Ferrari","SF90",2024,800,3500,TipoCombustivel.GASOLINA,30);
        Carro carro4 = new Carro("Opel","Corsa",1985,90,1200,TipoCombustivel.GPL,4);

        // Efetuar uma Corrida
        Carro vencedor = carro1.corrida(carro3);

        // Se o vencedor for nulo, quer dizer que a corrida empatou
        if(vencedor==null){
            System.out.println("Empate");
        }else{
            System.out.print("Vencedor: ");
            vencedor.exibirDetalhes();
        }



    }
}
