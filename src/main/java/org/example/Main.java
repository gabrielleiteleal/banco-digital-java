package org.example;

public class Main {
    public static void main(String[] args) {

        Banco banco = new ContaCorrente("Bradesco", 1, 123, 150.00, 50.00);
        Banco banco2 = new ContaCorrente("Itau", 5, 222, 100.00, 50.00);
        Banco bancoPoupanca = new ContaPoupanca("Nubank", 3, 543, 200.00);

        System.out.println(banco);
        banco.depositar(27.00);
        banco.sacar(20.00);
        banco.sacar(207.00);
        banco.depositar(100.00);

        System.out.println(banco2);

        banco.transferir(50.00, banco2);

        System.out.println(banco2);


    }
}