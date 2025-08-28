package org.yourcompany.yourproject;

import java.util.Scanner;

/**
 * Desafio ContaBanco - DIO / Santander 2025
 * @author Jhonatan
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print(">>> Por favor, digite o número da Conta: ");
        final int numero = entrada.nextInt();
        entrada.nextLine(); // limpar buffer do scanner

        System.out.print(">>> Por favor, digite o número da Agência: ");
        final String agencia = entrada.nextLine();

        System.out.print(">>> Por favor, digite o nome do Cliente: ");
        final String nomeCliente = entrada.nextLine();

        System.out.print(">>> Por favor, digite o saldo inicial: ");
        final double saldo = entrada.nextDouble();

        System.out.printf(
            "%nOlá %s, obrigado por criar uma conta em nosso banco!%n" +
            "Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
            nomeCliente, agencia, numero, saldo
        );

        entrada.close();
    }
}
