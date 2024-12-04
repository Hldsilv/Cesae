package Ex_10;



public class Main {
    public static void main(String[] args) {


 Funcionario funcionario1 = new Funcionario("Vitor", 1500, Departamento.RECURSOS_HUMANOS);

funcionario1.aumentarSalario(100);
        System.out.println(" O funcionário tem o nome: "+funcionario1.getNome()+ " tem um salário de: " +funcionario1.getSalario() + " e o departamento é: "+Departamento.RECURSOS_HUMANOS);

    }
}
