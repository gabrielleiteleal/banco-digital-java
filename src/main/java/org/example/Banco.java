package org.example;

public abstract class Banco {

    protected String nomeBanco;
    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    public Banco(String nomeBanco, int agencia, int numeroConta, double saldo) {
        this.nomeBanco = nomeBanco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    abstract boolean sacar(double valor);

    abstract void depositar(double valor);

    abstract void transferir(double valor, Banco bancoDestino);

    public String getNomeBanco() {
        return nomeBanco;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
