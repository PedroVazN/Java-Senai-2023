package banco;
public class banco {

    private double saldo; // O saldo não pode ser alterado em qualquer lugar de progama
    private String nomeTitular;

    public banco(double saldo, String nomeTitular) {

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

    public void depositar(double valor) {
        if (valor >= 0) {
            saldo += valor; // saldo = saldo + valor
            System.out.println("Deposito de: R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor invalido");
        }

    }

    // Metodo para sacar

    public boolean sacar(double valor) {
        if (saldo > valor && valor > 0) {
            saldo -= valor; // saldo = saldo = valor
            System.out.println("Saque de: R$" + valor + "realizado com sucesso");
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

}
