package com.java.main.banco;

public class ContaEspecial extends ContaInvestimento{

    public ContaEspecial(){

    }

    private double tarifaMensal;
    private double limiteChequeEspecial;

    // getters e setters
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

    public double getSaldoDisponivel(){
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    public void imprimirDemostrativo(){
        super.imprimirDemostrativo();
        System.out.println("Saldo dispinível:"+ getSaldoDisponivel());
    }

    @Override
    protected void validarSaldoParaSaque(double valorSaque){
        if (getSaldoDisponivel() < valorSaque){
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }


    public void debitarTarifaMensal(){
        sacar(getTarifaMensal());
    }

}
