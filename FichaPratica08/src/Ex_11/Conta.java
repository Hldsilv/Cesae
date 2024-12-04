package Ex_11;

public class Conta {

    private String numeroConta;
    private double saldo;
    private String titular;

    public Conta(String numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
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
}
