package org.yourcompany.yourproject;

import java.util.Scanner;

/**
 *
 * @author Jhonatan
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = entrada.nextInt();
        entrada.nextLine(); // limpar buffer do scanner

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = entrada.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = entrada.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = entrada.nextDouble();

        System.out.println("\nOlá " + nomeCliente + 
                ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numero + 
                " e seu saldo " + saldo + " já está disponível para saque.");

        entrada.close();
    }
}
