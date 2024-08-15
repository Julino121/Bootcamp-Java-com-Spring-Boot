package Aulas.estruturaRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public void saldoCompras() {
        double saldo = 100;

        while (saldo > 0) {
            double valorCompra = valorAleatorio();
            if (valorCompra < saldo) {
                saldo -= valorCompra;
                System.out.println("Compra de valor: " + valorCompra + "Foi aprovada");
                System.out.println("Saldo: " + saldo);
            } else {
                System.out.print("Compra de valor: " + valorCompra + "Foi recusada devido a falta de saldo");
                saldo -= valorCompra;
            }
        }
        System.out.println("\nSaldo finalizado com sucesso");

    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
