package Ex_02;

public class Main {
    public static void main(String[] args) {

        Cao cao1 = new Cao("Snoopy","Bulldog");
        Cao cao2 = new Cao("Scooby","Labrador");
        Cao cao3 = new Cao("Boby","Terrier");

        cao1.ladrar();
        System.out.println(cao1.getNome()+ " é um " + cao1.getRaca());
        System.out.println(cao2.getNome()+ " é um " + cao2.getRaca());
        System.out.println(cao3.getNome()+ " é um " + cao3.getRaca());

        cao1.setLatido("WOOOOF");
        System.out.println(cao1.getNome()+ " é um " + cao1.getRaca() + " e faz " + cao1.getLatido());
    }

}
