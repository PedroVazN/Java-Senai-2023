package projetoFinal;

import java.util.Scanner;

public class TestaBanco2 {

    public static void main(String[] args) {

        Scanner skycener = new Scanner(System.in);
        Banco banco = new Banco();
        Banner ban = new Banner();
        ContaCorrente cc = new ContaCorrente(null, null, 0, 0);

        while (true) {
            System.out.println("");

            ban.banner();

            System.out.println("1-Cadastrar Cliente");
            System.out.println("2-Sair do Programa");

            int respIni = skycener.nextInt();

            switch (respIni) {
                case 1:
                    System.out.print("\nDigite o número da conta (deve conter exatamente 4 dígitos): ");
                    String numeroConta = skycener.next();

                    if (numeroConta.length() != 4 || !numeroConta.matches("[0-9]+")) {
                        System.out.println("O número da conta deve ter exatamente 4 dígitos.");
                        break;
                    }

                    if (banco.contaExiste(numeroConta)) {
                        System.out.println(
                                "Já existe uma conta com o mesmo número. Por favor, escolha outro número de conta.");
                        break;
                    }

                    System.out.print("Digite a idade do cliente: ");
                    int idade = skycener.nextInt();

                    if (idade < 18) {
                        System.out.println("O cliente deve ter pelo menos 18 anos para abrir uma conta.");
                        break;
                    }

                    System.out.print("Digite o nome do titular da conta: ");
                    String titularConta = skycener.next();
                    System.out.print("\nTipo da conta \n1 - Conta Corrente: \n2 - Conta Poupança: ");
                    int typeAcc = skycener.nextInt();

                    if (typeAcc == 1) {

                        double limiteChequeEspecial = 2000;
                        System.out.print("\nLimite do Cheque Especial: " + limiteChequeEspecial);
                        Conta contaCorrente = new ContaCorrente(numeroConta, titularConta, limiteChequeEspecial, idade);
                        banco.cadastrarConta(contaCorrente);
                        System.out.println("\nConta cadastrada com sucesso.");

                        /////////////////////////////////////////////////////////////////////////////////

                    } else if (typeAcc == 2) {
                        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titularConta, 0.03, idade);

                        System.out.print("Digite o valor inicial de depósito para a conta poupança: ");
                        double valorDepositoInicial = skycener.nextDouble();
                        contaPoupanca.depositar(valorDepositoInicial);

                        System.out.print("Quantos meses quer deixar rendendo: ");
                        int meses = skycener.nextInt();

                        double saldoAntesRendimento = contaPoupanca.getSaldo();
                        contaPoupanca.renderRendimento(meses);

                        double rendimento = contaPoupanca.getSaldo() - saldoAntesRendimento;
                        rendimento = Math.round(rendimento * 100.0) / 100.0;

                        System.out.println("Valor total rendido em " + meses + " meses: R$" + rendimento);

                        banco.cadastrarConta(contaPoupanca);
                        System.out.println("\nConta cadastrada com sucesso.");
                        break;
                    } else {
                        System.out.println("\nOpção inválida. Conta não cadastrada.");
                    }
                    break;

                case 2:
                    System.out.println("\nSaindo do programa.");
                    System.exit(0);
                    break;
            }

            ban.menu();

            /////////////////////////////////////////////////////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////

            while (true) {
                menu();
                int escolha = skycener.nextInt();

                switch (escolha) {
                    case 1:

                        System.out.print("\nDigite o número da conta (deve conter exatamente 4 dígitos): ");
                        String numeroConta = skycener.next();

                        if (numeroConta.length() != 4 || !numeroConta.matches("[0-9]+")) {
                            System.out.println("O número da conta deve ter exatamente 4 dígitos.");
                            break;
                        }

                        if (banco.contaExiste(numeroConta)) {
                            System.out.println(
                                    "Já existe uma conta com o mesmo número. Por favor, escolha outro número de conta.");
                            break;
                        }

                        System.out.print("Digite a idade do cliente: ");
                        int idade = skycener.nextInt();

                        if (idade < 18) {
                            System.out.println("O cliente deve ter pelo menos 18 anos para abrir uma conta.");
                            break;
                        }

                        System.out.print("Digite o nome do titular da conta: ");
                        String titularConta = skycener.next();
                        System.out.print("\nTipo da conta \n1 - Conta Corrente: \n2 - Conta Poupança: ");
                        int typeAcc = skycener.nextInt();

                        /////////////////////////////////////////////////////////////////////////////////

                        if (typeAcc == 1) {

                            double limiteChequeEspecial = 2000;
                            System.out.print("\nLimite do Cheque Especial: " + limiteChequeEspecial);
                            Conta contaCorrente = new ContaCorrente(numeroConta, titularConta, limiteChequeEspecial,
                                    idade);
                            banco.cadastrarConta(contaCorrente);
                            System.out.println("\nConta cadastrada com sucesso.");

                        } else if (typeAcc == 2) {

                            ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titularConta, 0.03, idade);

                            System.out.print("Digite o valor inicial de depósito para a conta poupança: ");
                            double valorDepositoInicial = skycener.nextDouble();
                            contaPoupanca.depositar(valorDepositoInicial);

                            System.out.print("Quantos meses quer deixar rendendo: ");
                            int meses = skycener.nextInt();

                            double saldoAntesRendimento = contaPoupanca.getSaldo();
                            contaPoupanca.renderRendimento(meses);

                            double rendimento = contaPoupanca.getSaldo() - saldoAntesRendimento;
                            rendimento = Math.round(rendimento * 100.0) / 100.0;

                            System.out.println("Valor total rendido em " + meses + " meses: R$" + rendimento);

                            banco.cadastrarConta(contaPoupanca);
                            System.out.println("\nConta cadastrada com sucesso.");

                        } else {
                            System.out.println("\nOpção inválida. Conta não cadastrada.");
                        }
                        break;

                    /////////////////////////////////////////////////////////////////////////////////

                    case 2:

                        ban.dep();
                        System.out.print("\nNúmero da conta: ");
                        String numeroAccdep = skycener.next();

                        System.out.print("Valor a depositar: ");
                        double valorDeposito = skycener.nextDouble();

                        Conta accDep = banco.encontrarConta(numeroAccdep);

                        if (accDep != null) {
                            accDep.depositar(valorDeposito);
                            System.out.println("Depósito realizado com sucesso.");
                        } else {
                            System.out.println("\nConta não encontrada.");
                        }
                        break;

                    case 3:

                        ban.sac();
                        System.out.print("\nNúmero da conta: ");
                        String numeroContaSaque = skycener.next();

                        System.out.print("Valor a sacar: ");
                        double valorSaque = skycener.nextDouble();

                        Conta contaSaque = banco.encontrarConta(numeroContaSaque);

                        if (contaSaque != null) {
                            contaSaque.sacar(valorSaque);
                        } else {
                            System.out.println("\nConta não encontrada.");
                        }
                        break;

                    case 4:

                        System.out.print("\nNúmero da conta de origem: ");
                        String contaOrigem = skycener.next();

                        System.out.print("Número da conta de destino: ");
                        String contaDestino = skycener.next();
                        
                        System.out.println("Valor a transferir: ");
                        double valorTransferencia = skycener.nextDouble();

                        banco.transferencia(contaOrigem, contaDestino, valorTransferencia);
                        break;

                    case 5:

                        System.out.print("\nNúmero da conta: ");
                        String numeroContaSaldo = skycener.next();

                        Conta contaSaldo = banco.encontrarConta(numeroContaSaldo);
                        
                        if (contaSaldo != null) {
                            double saldo = contaSaldo.consultarSaldo();
                            System.out.println("\nSaldo da conta: " + saldo);
                        } else {
                            System.out.println("Conta não encontrada.");
                        }
                        break;

                    case 6:

                        ban.bancu();
                        banco.listarContas();
                        break;

                    case 0:
                        System.out.println("\nSaindo do programa.");
                        break;
                    default:
                        System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");
                }

                if (escolha == 0) {
                    break;
                }
            }

            skycener.close();
        }

    }

    public static void menu() {
        System.out.println("\n\t==== MENU SKYCER BANK ====\n");
        System.out.println("1. Cadastrar conta/Cliente");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Transferir");
        System.out.println("5. Consultar saldo");
        System.out.println("6. Listar contas");

        System.out.println("0. Sair do programa");
        System.out.print("\nEscolha uma opção: ");

    }

}
