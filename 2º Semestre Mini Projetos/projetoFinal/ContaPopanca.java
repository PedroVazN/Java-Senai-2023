package projetoFinal;
class ContaPoupanca extends Conta {
    private double taxaRendimento = 0.3;
    double saldoAtual;

    public ContaPoupanca(String numeroConta, String titularConta, double taxaRendimento, int idade) {
        super(numeroConta, titularConta, idade);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento(double taxaRendimento) {
        return taxaRendimento;
    }

    @Override
    public void calcularSaldo() {
    }

    @Override
    public String toString() {
        System.out.println("*****************************************");
        return "Conta Popança {\nNúmero: " + getNumeroConta() + " \nTitular: " + getTitularConta() + "\nSaldo: "
                + getSaldo() + "\nIdade: " + getIdade() + "\nTaxa de Rendimento: " + taxaRendimento + " }" + "\n*****************************************";
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0) {
            saldoAtual = getSaldo();
            if (valor <= saldoAtual) {
                setSaldo(saldoAtual - valor);
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            double saldoAtual = getSaldo();
            setSaldo(saldoAtual + valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public double consultarSaldo() {
        return getSaldo();
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    public void renderRendimento(int meses) {
    double rendimento = getSaldo() * taxaRendimento * meses;
    setSaldo(getSaldo() + rendimento);
}

}
