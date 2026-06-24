package Conta;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.println("Digite o nome do cliente:");
        conta.nomeCliente = sc.nextLine();

        System.out.println("Digite o CPF:");
        conta.cpf = sc.nextLine();

        System.out.println("Digite o nome do banco:");
        conta.nomeBanco = sc.nextLine();

        System.out.println("Digite a agência:");
        conta.agencia = sc.nextLine();

        System.out.println("Digite o número da conta:");
        conta.numeroConta = sc.nextInt();

        System.out.println("\nSaldo inicial: R$ " + conta.saldo);

        System.out.println("Digite o valor para saque:");
        double valor = sc.nextDouble();

        conta.sacar(valor);

        sc.close();
    }
}