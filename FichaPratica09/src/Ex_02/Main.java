package Ex_02;

public class Main {
    public static void main(String[] args) {


        Conta conta1 = new Conta("12345",500,"Vitor S.", 200);
        Conta conta2 = new Conta("11111", 100,"Joaquim A.",0);
        Conta conta3 = new Conta("22222",10000,"Primo da Suiça",0);

        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta3.mostrarSaldo();

        System.out.println();
//
//        // deposito
//        conta1.depositar(1000);
//        conta1.mostrarSaldo();
//        conta2.mostrarSaldo();
//        conta3.mostrarSaldo();
//
//        System.out.println();
//
//        // tentar levantar
//        conta2.levantar(3000);
//        conta1.mostrarSaldo();
//        conta2.mostrarSaldo();
//        conta3.mostrarSaldo();
//
//        System.out.println();
//
//        // levantar
//        conta2.levantar(20);
//        conta1.mostrarSaldo();
//        conta2.mostrarSaldo();
//        conta3.mostrarSaldo();
//
//        System.out.println();
//
//        // tentar transferir
//        conta2.transferencia(conta1,9000);
//        conta1.mostrarSaldo();
//        conta2.mostrarSaldo();
//        conta3.mostrarSaldo();
//
//        System.out.println();
//
//        // transferencia
//        conta3.transferencia(conta1,500);
//        conta1.mostrarSaldo();
//        conta2.mostrarSaldo();
//        conta3.mostrarSaldo();

        conta1.aMargemDeEmprestimo();
        conta2.aMargemDeEmprestimo();
        conta3.aMargemDeEmprestimo();

        conta1.pedirEmprestimo(200);
        conta2.pedirEmprestimo(200);
        conta3.pedirEmprestimo(200);
        conta1.setAnoDeAbertura();
    }
}
