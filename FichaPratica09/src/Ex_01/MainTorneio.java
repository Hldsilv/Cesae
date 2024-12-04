package Ex_01;

public class MainTorneio {
    public static void main(String[] args) {

        // Instanciar os carros
        Carro carro1 = new Carro("Mercedes", "A45", 2024, 420, 3500, TipoCombustivel.GASOLINA, 25);
        Carro carro2 = new Carro("Fiat", "Uno", 1980, 50, 1000, TipoCombustivel.DIESEL, 7);
        Carro carro3 = new Carro("Ferrari", "SF90", 2024, 800, 3500, TipoCombustivel.GASOLINA, 30);
        Carro carro4 = new Carro("Opel", "Corsa", 1985, 90, 1200, TipoCombustivel.GPL, 4);

        // Corrida 1
        System.out.println("*************** Corrida 1 ***************");
        carro1.exibirDetalhes();
        carro1.ligar();

        System.out.println("\nVS\n");

        carro2.exibirDetalhes();
        carro2.ligar();

        Carro vencedor1 = carro1.corrida(carro2);

        System.out.print("\nVencedor da Corrida 1: ");
        vencedor1.exibirDetalhes();

        // Corrida 2
        System.out.println("\n\n*************** Corrida 2 ***************");
        carro3.exibirDetalhes();
        carro3.ligar();
        System.out.println("\nVS\n");
        carro4.exibirDetalhes();
        carro4.ligar();

        Carro vencedor2 = carro3.corrida(carro4);

        System.out.print("\nVencedor da Corrida 2: ");
        vencedor2.exibirDetalhes();

        // Corrida Final
        System.out.println("\n\n*************** Corrida Final ***************");
        vencedor1.exibirDetalhes();
        vencedor1.ligar();
        System.out.println("\nVS\n");
        vencedor2.exibirDetalhes();
        vencedor2.ligar();

        Carro grandeVencedor = vencedor1.corrida(vencedor2);

        System.out.print("\nGrande Vencedor da Corrida Final: ");
        grandeVencedor.exibirDetalhes();

    }
}
