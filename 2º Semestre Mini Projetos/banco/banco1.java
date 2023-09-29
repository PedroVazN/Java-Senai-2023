package banco;

    /*
 *  Modificadores de Acesso: Servem para definir a visibilidade que determinar
 *  classe ou membro terá diante das outras.
 *  Eles tão relacionados ao conceito de ENCAPSULAMENTO (SEGURANÇA)
 * Temos os seguintes modificadores:
 * - public: Torna uma classe visivél para qualquer outra classe; [SEM ENCAPSULAMENTO]
 * - protected: Torna um membro acessivel as classes do mesmo pacote atraves da herança
 * - private: Torna um membro acessivel apenas pra classe que o contém [Encapsulamento]
 */

import java.util.Scanner;
import java.util.Random;

public class banco1{

    Random gerador = new Random();
    int GeradorAutomaticoVinicius13 = gerador.nextInt(9999);

    private double saldo; // O saldo não pode ser alterado em qualquer lugar de progama
    private String nomeTitular;
    public int saldo1;

    Scanner sc = new Scanner(System.in);

    public banco1(double saldo, String nomeTitular) {

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo Inicial é invalido papae.");
        }

        this.nomeTitular = nomeTitular;

    }

    // Metodo para consultar saldo

    public double consultarSaldo() {
        return saldo;
    }

    // Metodo para depositar

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor; // saldo = saldo + valor
            System.out.println("Deposito de: R$" + valor + " realizado com sucesso");
            return true;
        } else {
            System.out.println("Valor invalido");
            return false;
        }

    }

    // Metodo para sacar

    public boolean sacar(double valor) {
        if (saldo >= valor && valor > 0) {
            saldo -= valor; // saldo = saldo = valor
            System.out.println("Saque de: R$ " + valor + " realizado com sucesso");
            return true;
        } else {
            System.out.println("Valor invalido, ou Saldo insuficiente");
            return false;
        }
    }

    // Metodo para exibição dos dados da conta

    public void exibirInformações() {
        System.out.println("=========SENAI BANK=========");
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("==================================");
    }

    public void menu(){
        
        banco1 SenaiBank = new banco1(0, null);
        System.out.println("Bem vindo ao Banco Senai");

        System.out.println("Digite seu nome");
        String nome = sc.next();

        System.out.println("Qual Valor Você quer depositar?");
        saldo = sc.nextDouble();
        double saldoInicial = saldo;
        System.out.println("O Numero da sua Conta é: " + GeradorAutomaticoVinicius13);



        while (true) {
            

            System.out.println("Escolha Uma Opção");
            System.out.println("1 - Consultar Extrato");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4-  Ver Meus dados");
            System.out.println("0 - Sair");

            int escolha = sc.nextInt();

            switch (escolha) {
                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Consultando o extrato...");
                    System.out.println(this.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Quanto Voce Quer Sacar?");
                    double valor = sc.nextDouble();
                    sacar(valor);
                    break;
                case 3:
                    System.out.println("Quanto Voce Quer Depositar?");
                    int depositar1 = sc.nextInt();
                    depositar(depositar1);
                    break;
                case 4:

                System.out.println("Olá " +nome);
                System.out.println("Voce Depositou: R$ " + saldoInicial);
                System.out.println("O seu Saldo é : R$ " + saldo);
                System.out.println("O Numero da sua Conta é: " + GeradorAutomaticoVinicius13);

                break;
                default:
                    System.out.println("Opção Inválida");
                    break;

            }

        }
    }
}

