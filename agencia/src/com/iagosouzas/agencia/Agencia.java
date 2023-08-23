package com.iagosouzas.agencia;

import java.util.Random;

public class Agencia {
    private int numAgencia;

    public Agencia(int numAgencia){
        this.numAgencia = numAgencia;
    }

    public Conta cadastrarConta(Cliente titular){
        int novoNumeroConta = gerarNumeroConta();
        Conta novaConta = new Conta(novoNumeroConta, titular);
        return novaConta;
    }

    private int gerarNumeroConta(){
        String numAleatorios = "0123456789";
        Random random = new Random();
        StringBuilder numeroConta = new StringBuilder();

        int numeroDigitos = 6;
        for (int i = 0; i < numeroDigitos ; i++) {
            int indiceAleatorio = random.nextInt(numAleatorios.length());
            char digitoAletorio = numAleatorios.charAt(indiceAleatorio);
            numeroConta.append(digitoAletorio);
        }
        return Integer.parseInt(numeroConta.toString());
    }

}
