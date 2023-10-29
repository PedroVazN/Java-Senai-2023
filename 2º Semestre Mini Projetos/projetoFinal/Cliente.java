package projetoFinal;
import java.util.ArrayList;
import java.util.List;

class Cliente implements OperacoesConta {
    private String nome;
    private int idade;
    private int numeroConta;
    private List<Conta> contas;

    public Cliente(String nome, int idade, int numeroConta) {
        this.nome = nome;
        this.idade = idade;
        this.numeroConta = numeroConta;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getID() {
        return numeroConta;
    }

    public List<Conta> getContas() {
        return contas;
    }

    @Override
    public void depositar(double valor) {
    }

    @Override
    public void sacar(double valor) {
    }

    @Override
    public double consultarSaldo() {
        return 0.0;
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}
