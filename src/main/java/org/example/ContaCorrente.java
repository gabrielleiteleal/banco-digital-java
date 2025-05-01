package org.example;

public class ContaCorrente extends Banco {

    private double limite;

    public ContaCorrente(String nomeBanco, int agencia, int numeroConta, double saldo, double limite) {
        super(nomeBanco, agencia, numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    boolean sacar(double valor) {
        if ((saldo - valor) >= -limite) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saque Inválido: Valor excede o limite!");
            return false;
        }
    }

    @Override
    void depositar(double valor) {
        saldo += valor;
    }

    @Override
    void transferir(double valor, Banco bancoDestino) {
        if(sacar(valor)){
            bancoDestino.depositar(valor);
        }else{
            System.out.println("Saque Inválido: Valor insuficiente!");
            System.out.println("Saldo atual: " + super.saldo);
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
