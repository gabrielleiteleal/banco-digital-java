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
            System.out.println("Você sacou: " + valor);
            System.out.println("Saldo atual: " + super.saldo);
            return true;
        } else {
            System.out.println("Saque Inválido: Valor excede o limite!");
            return false;
        }
    }

    @Override
    void depositar(double valor) {
        saldo += valor;
        System.out.println("Você depositou: " + valor);
        System.out.println("Saldo atual: " + super.saldo);
    }

    @Override
    void transferir(double valor, Banco bancoDestino) {
        if(sacar(valor)){
            bancoDestino.depositar(valor);
            System.out.printf("Você transferiu %.2f para a conta %s \n", valor, bancoDestino.getNomeBanco());
            System.out.println("Saldo atual: " + bancoDestino.getSaldo());
        }else{
            System.out.println("Saque Inválido: Valor insuficiente!");
            System.out.println("Saldo atual: " + super.saldo);
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limite=" + limite +
                ", nomeBanco='" + nomeBanco + '\'' +
                ", agencia=" + agencia +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
