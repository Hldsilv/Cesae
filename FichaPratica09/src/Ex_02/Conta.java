package Ex_02;


public class Conta {

    private String numeroConta;
    private double saldo;
    private String titular;
    private int anoDeAbertura;
    private double margemDeEmprestimo;
    private int valorEmDivida;

    public Conta(String numeroConta, double saldo, String titular, int valorEmDivida) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
        this.valorEmDivida = valorEmDivida;
    }
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito Efetuado: " + valor);
    }

    public void levantar(double valor) {

        if (this.saldo >= valor) { // temos saldo suficiente
            this.saldo -= valor;
            System.out.println("Levantamento Efetuado: " + valor);
        } else { // não temos saldo suficiente
            System.out.println("Levantamento Recusado. Falta de Saldo.");
        }

    }

    public void transferencia(Conta contaDestino, double valor) {

        if (this.saldo >= valor) { // temos saldo suficiente

            System.out.println("Transferência Efetuada: " + valor);
            this.saldo -= valor; // Diminuo o saldo do remetente
            contaDestino.saldo += valor; // Aumento o saldo do destinatário


        } else { // não temos saldo suficiente

            System.out.println("Transferência Recusada. Saldo Insuficiente.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo da Conta " + this.numeroConta + ": " + this.saldo + " EUR");
    }

    public void setAnoDeAbertura() {
        this.anoDeAbertura = 2023;
        System.out.println("Ano de abertura: "+this.anoDeAbertura);
    }


    public void aMargemDeEmprestimo() {
    double margem = 0.9;
    this.margemDeEmprestimo= saldo*margem;
    System.out.println("A margem de empréstimo é de: "+this.margemDeEmprestimo);
}

    public int getValorEmDivida() {
        return valorEmDivida;
    }

    public boolean pedirEmprestimo(double valor) {

        if (this.valorEmDivida > 0) {
            System.out.println("Não pode pedir mais do que um empréstimo");
        return false;
        }
        if (valor <= this.margemDeEmprestimo) {
                this.saldo += valor;

                System.out.println("Saldo :" + this.saldo + " Dívida: " + valor);
                return true;
            }else{
            System.out.println("O valor é superior à margem de empréstimo");
            return false;
        }



    }
}


