package Ex_03;

public class Main {
    public static void main(String[] args) {
        String[] alimentacaoDumbo = new String[3];
//        alimentacaoDumbo[0] = "Erva";
//        alimentacaoDumbo[1] = "Milho";
//        alimentacaoDumbo[2] = "Palha";

//        String[] alimentacaoDumbo = new String[]{"Erva","Milho","Palha"};

        Animal animal1 = new Animal("Dumbo", "Elefante", "África do Sul", 1000, new String[]{"Erva", "Milho", "Palha"});
        Animal animal2 = new Animal("Simba", "Leão", "Quénia", 350, new String[]{"Carne", "Cebolas"});

        animal1.exibirDetalhes();
        animal2.exibirDetalhes();
        System.out.println("_______________________________________________________________________________________");

        animal1.comer("Peixe", 1500);

        animal1.exibirDetalhes();
        animal2.exibirDetalhes();
        System.out.println("_______________________________________________________________________________________");

        animal1.comer("Milho", 1000);

        animal1.exibirDetalhes();
        animal2.exibirDetalhes();
        System.out.println("_______________________________________________________________________________________");

        animal2.comer("Milho",1000);

        animal1.exibirDetalhes();
        animal2.exibirDetalhes();
        System.out.println("_______________________________________________________________________________________");
    }
}
