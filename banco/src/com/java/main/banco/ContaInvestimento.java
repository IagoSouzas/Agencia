package com.java.main.banco;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(){
    }

    private double valorTotalRendimentos;

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualJuros){
            double valorRendimentos = getSaldo() * percentualJuros / 100;
            this.valorTotalRendimentos += valorRendimentos;
            depositar(valorRendimentos);
    }

}
