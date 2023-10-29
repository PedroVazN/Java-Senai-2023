package projetoFinal;
interface OperacoesConta {

    void depositar(double valor);

    void sacar(double valor);

    double consultarSaldo();
}

abstract class Conta {

    private String numeroConta;
    private String titularConta;
    private double saldo;
    private int idade;



    public Conta(String numeroConta, String titularConta, int idade) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = 0.0;
        this.idade = idade;

    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getIdade() {
        return idade;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void calcularSaldo();

    @Override
    public String toString() {
        return "\nNúmero da Conta: " + numeroConta + "\nTitular da Conta: " + titularConta + "\nSaldo: " + saldo + "\nIdade: " + idade;
    }

    public double consultarSaldo() {
        return 0;
    }

    public void sacar(double valor) {
    }

    public void depositar(double valor) {
    }

    public void setTaxaRendimento(double d) {
    }


}


