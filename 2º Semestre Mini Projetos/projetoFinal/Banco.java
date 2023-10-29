package projetoFinal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Banco {

    private List<Conta> contas;

    private double saldo;
    double resultC = 0;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void cadastrarConta(Conta contaSendoCadastrada) {
        contas.add(contaSendoCadastrada);
    }

    public boolean depositar(double valor) {
        if (valor > 0) {

            saldo += valor;
            System.out.println("Deposito de: R$" + valor + " realizado com sucesso.");
            return true;

        } else {
            System.out.println("Valor invalido.");
            return false;
        }
    }

    public boolean sacar(double valor) {
        if (saldo >= valor && valor > 0) {
            saldo -= valor;
            System.out.println("\nSaque de: R$ " + valor + " realizado com sucesso");
            return true;
        } else {
            System.out.println("Valor invalido, ou Saldo insuficiente. x");
            return false;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void transferencia(String numeroContaOrigem, String numeroContaDestino, double valor) {

        Conta origem = encontrarConta(numeroContaOrigem);
        Conta destino = encontrarConta(numeroContaDestino);

        if (origem == null || destino == null) {
            System.out.println("Conta de origem ou conta de destino não encontrada. x");
            return;
        }

        if (origem.consultarSaldo() >= valor) {
            origem.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência concluída com sucesso papai.");
        } else {
            System.out.println("Saldo insuficiente na conta de origem.");
        }
    }


    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public Conta encontrarConta(String numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }


    private void setlimiteChequeEspecial(double novoLimiteChequeEspecial) {
    }

    public double getLimiteChequeEspecial() {
        return 0;
    }

    public int getSaldo() {
        return 0;
        
    }

    public boolean contaExiste(String numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return true; // Uma conta com o mesmo número já existe
            }
        }
        return false; // Nenhuma conta com o mesmo número foi encontrada
    }
}

