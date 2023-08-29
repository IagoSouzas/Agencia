package com.algaworks.banco;

public class ContaEspecial {

    private double valorTotalRendimentos;
    private double tarifaMensal;
    private double limiteChequeEspecial;

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    // getters e setters
    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoDisponivel(){
        return getSaldo() + getLimiteChequeEspecial();
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void creditarRendimentos(double percentualJuros){
            double valorRendimentos = getSaldo() * percentualJuros / 100;
            this.valorTotalRendimentos += valorRendimentos;
            depositar(valorRendimentos);
    }

    public void sacar(double valorSaque){
        if (valorSaque <= 0){
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        if (getSaldoDisponivel() < valorSaque){
            throw new IllegalArgumentException("Valor insuficiente para saque");
        }

        saldo -= valorSaque;

    }

    public void depositar(double valorDeposito){
        if (valorDeposito <= 0){
            throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
        }
        saldo += valorDeposito;
    }

    public void imprimirDemonstrativo(){
        System.out.println();
        System.out.println("Agência: " + getAgencia());
        System.out.println("Conta: "+ getNumero());
        System.out.println("Titular: "+ getTitular().getNome());
        System.out.println("Saldo: "+ getSaldo());
        System.out.println("Saldo dispónivel: "+ getSaldoDisponivel());
    }

    public void debitarTarifaMensal(){
            sacar(getTarifaMensal());
    }

}
