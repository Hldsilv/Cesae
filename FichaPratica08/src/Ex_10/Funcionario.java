package Ex_10;

public class Funcionario {
    private String nome;
    private int salario;
    private Departamento departamento;

    public Funcionario(String nome, int salario, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirDados(){

        System.out.println("Nome: " +this.nome+ " | " +"Salário: "+this.salario+ " | "+ "Departamento: "+this.departamento );

    }
    public String getNome(){
        return this.nome;
    }



    public double aumentarSalario(double percentagem) {

        percentagem/= 100;
        double conta = percentagem * this.salario;

       this.salario+=conta;
       return this.salario;
    }

    public int getSalario(){
        return salario;
    }

}

