package projetoFinal;
import java.util.Scanner;

class ContaCorrente extends Conta {
    private double limiteChequeEspecial = 2000;
    private double saldoChequeAtualizado;
    private boolean usandoChequeEspecial;

    public ContaCorrente(String numeroConta, String titularConta, double limiteChequeEspecial, int idade) {
        super(numeroConta, titularConta, idade);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public double getSaldoChequeAtualizado() {
        return saldoChequeAtualizado;
    }

    @Override
    public void calcularSaldo() {

        double taxas = 0.05 * getSaldo();
        setSaldo(getSaldo() - taxas + limiteChequeEspecial);
    }

    public void setLimiteChequeEspecial(double novoLimiteChequeEspecial) {
        limiteChequeEspecial = novoLimiteChequeEspecial;
    }

    @Override
    public double consultarSaldo() {
        return getSaldo();
    }

    public void sacar(double valorSaque) {

        if (valorSaque > 0) {
            double saldoAnterior = getSaldo();

            if (valorSaque > saldoAnterior + limiteChequeEspecial) {
                System.out.println("Saldo e limite do cheque especial insuficientes para saque.");
                
            } else {
                if (valorSaque > saldoAnterior) {
                    double valorSaqueChequeEspecial = valorSaque - saldoAnterior;
                    saldoAnterior = 0;
                    limiteChequeEspecial -= valorSaqueChequeEspecial;
                    usandoChequeEspecial = true;
                    System.out.println("Saque realizado com sucesso usando cheque especial.");
                } else {
                    saldoAnterior -= valorSaque;
                    System.out.println("Saque realizado com sucesso.");
                }

                setSaldo(saldoAnterior);
                System.out.println("Saldo após saque: " + getSaldo());
                System.out.println("Limite do Cheque Especial após saque: " + limiteChequeEspecial);
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    public void depositar(double valorDeposito) {

        if (valorDeposito > 0) {
            double saldoAnterior = getSaldo();
            
            if (usandoChequeEspecial) {
               
                double jurosChequeEspecial = valorDeposito * 0.08;
                valorDeposito -= jurosChequeEspecial;
                saldoAnterior += valorDeposito;

            } else {
                saldoAnterior += valorDeposito;
            }
            usandoChequeEspecial = false; // Resetar o uso do cheque especial após o depósito

            setSaldo(saldoAnterior);
            System.out.println("Depósito realizado com sucesso.");
            System.out.println("Saldo após depósito: " + getSaldo());
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }


    @Override
    public String toString() {
        System.out.println("\n==================================");
        return "Conta Corrente {\nNúmero: " + getNumeroConta() + " \nTitular: " + getTitularConta() + "\nSaldo: "
                + getSaldo() + "\nIdade: " + getIdade() + " }" + "\n==================================";
    }

    

}
