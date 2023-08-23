package com.iagosouzas.agencia;

public class Conta {

    private int numConta;
    private double saldo;
    private Cliente titular;
    private Agencia agencia;
    public Conta(int numConta, Cliente titular){

        this.numConta = numConta;
        this.titular = titular;
        this.saldo = 0.0;

    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void extrato(){
        System.out.println("-------------------");
        System.out.println("Extrato da conta: " + numConta);
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Saldo: "+ saldo);
    }

}
