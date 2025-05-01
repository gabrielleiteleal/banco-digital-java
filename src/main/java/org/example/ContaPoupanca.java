package org.example;

public class ContaPoupanca extends Banco {

    public ContaPoupanca(String nomeBanco, int agencia, int numeroConta, double saldo) {
        super(nomeBanco, agencia, numeroConta, saldo);
    }

    @Override
    void transferir(double valor, Banco bancoDestino) {

    }

    @Override
    boolean sacar(double valor) {
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }else{
            System.out.println("Saque Inválido: Valor insuficiente!");
            return false;
        }
    }

    @Override
    void depositar(double valor) {
        saldo += valor;
    }
}
