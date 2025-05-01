package org.example;

public class ContaPoupanca extends Banco {

    public ContaPoupanca(String nomeBanco, int agencia, int numeroConta, double saldo) {
        super(nomeBanco, agencia, numeroConta, saldo);
    }

    @Override
    void transferir(double valor, Banco bancoDestino) {
        if (sacar(valor)) {
            bancoDestino.depositar(valor);
            System.out.printf("Você transferiu %.2f para a conta %s \n", valor, bancoDestino.getNomeBanco());
            System.out.println("Saldo atual: " + bancoDestino.getSaldo());
        } else {
            System.out.println("Saque Inválido: Valor insuficiente!");
            System.out.println("Saldo atual: " + super.saldo);
        }
    }

    @Override
    boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Você sacou: " + valor);
            System.out.println("Saldo atual: " + super.saldo);
            return true;
        } else {
            System.out.println("Saque Inválido: Valor insuficiente!");
            return false;
        }
    }

    @Override
    void depositar(double valor) {
        System.out.println("Você depositou: " + valor);
        System.out.println("Saldo atual: " + super.saldo);
        saldo += valor;
    }
}
