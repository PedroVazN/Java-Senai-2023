package trabalho;

class Atendente extends Funcionario {
    public Atendente(String nome, String cargo, double salario) {
        super(nome, cargo, salario);
    }

    public String processarPedido(String pedido) {
        return "Pedido processado pelo Atendente " + getNome() + ": " + pedido;
    }
}
