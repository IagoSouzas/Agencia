package com.iagosouzas.agencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite seu cpf: ");
        String cpf = entrada.nextLine();
        System.out.println("Digite o número da Agência que deseja cadastrar: ");
        System.out.println("1.São paulo\n2.Minas Gerais\n3.Rio de Janeiro");
        int numAgencia = entrada.nextInt();

        System.out.println("Digite o valor que deseja depositar: ");
        double deposito = entrada.nextDouble();

        System.out.println("Digite o valor que deseja sacar: ");
        double saque = entrada.nextDouble();





        Cliente cliente1 = new Cliente(nome,cpf);
        Agencia agencia = new Agencia(numAgencia);

        Conta contaCliente1 = agencia.cadastrarConta(cliente1);
        contaCliente1.depositar(deposito);
        contaCliente1.sacar(saque);
        contaCliente1.extrato();
    }
}