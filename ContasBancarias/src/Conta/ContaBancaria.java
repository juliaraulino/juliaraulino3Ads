package Conta;
public class ContaBancaria {

    String nomeCliente;
    String cpf;
    String nomeBanco;
    String agencia;
    int numeroConta;
    double saldo = 500.00;

    public void sacar(double valor) {

        if(valor <= saldo) {
            saldo = saldo - valor;

            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + saldo);
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
}